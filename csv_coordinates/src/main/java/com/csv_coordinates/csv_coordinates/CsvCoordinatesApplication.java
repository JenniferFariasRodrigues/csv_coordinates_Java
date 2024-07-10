package com.csv_coordinates.csv_coordinates;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.geotools.referencing.GeodeticCalculator;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

public class CsvCoordinatesApplication {
	public static void main(String[] args) {
        if (args.length < 2 || !args[0].equals("--location")) {
            System.out.println("Usage: ./csv-search --location <latitude,longitude>");
            return;
        }

        String[] coords = args[1].split(",");
        double targetLat = Double.parseDouble(coords[0]);
        double targetLon = Double.parseDouble(coords[1]);

        String csvFile = "/home/jennifer/Documentos/Pessoal/Wplex_test/csv-index/data/eventlog.csv";
        List<Event> events = readEvents(csvFile);

        List<Event> nearbyEvents = findNearbyEvents(events, targetLat, targetLon, 50.0);

        nearbyEvents.sort(Comparator.comparing(Event::getTimestamp));

        for (Event event : nearbyEvents) {
            double distance = calculateDistance(targetLat, targetLon, event.getLatitude(), event.getLongitude());
            System.out.println(event.getDeviceId() + "," + distance + "," + event.getTimestamp() + "," + event.getPayload());
        }
    }

    private static List<Event> readEvents(String csvFile) {
        List<Event> events = new ArrayList<>();
        try (CSVReader reader = new CSVReader(new FileReader(csvFile))) {
            List<String[]> records = reader.readAll();
            for (String[] record : records.subList(1, records.size())) {
                String deviceId = record[0];
                String eventId = record[1];
                String timestamp = record[2];
                String payload = record[3];
                String company = record[4];
                String[] latLon = payload.split(",");
                double latitude = Double.parseDouble(latLon[2]);
                double longitude = Double.parseDouble(latLon[3].substring(0, latLon[3].length() - 1));

                events.add(new Event(deviceId, eventId, timestamp, latitude, longitude, payload, company));
            }
        } catch (IOException | CsvException e) {
            e.printStackTrace();
        }
        return events;
    }

    private static List<Event> findNearbyEvents(List<Event> events, double targetLat, double targetLon, double radiusMeters) {
        List<Event> nearbyEvents = new ArrayList<>();
        for (Event event : events) {
            double distance = calculateDistance(targetLat, targetLon, event.getLatitude(), event.getLongitude());
            if (distance <= radiusMeters) {
                nearbyEvents.add(event);
            }
        }
        return nearbyEvents;
    }

    private static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        GeodeticCalculator calc = new GeodeticCalculator();
        calc.setStartingGeographicPoint(lon1, lat1);
        calc.setDestinationGeographicPoint(lon2, lat2);
        return calc.getOrthodromicDistance();
    }
}



// @SpringBootApplication
// public class CsvCoordinatesApplication {

// 	public static void main(String[] args) {
// 		SpringApplication.run(CsvCoordinatesApplication.class, args);
// 	}

// }

package com.csv_coordinates.csv_coordinates;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.geotools.referencing.GeodeticCalculator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

@RestController
public class EventController {

    @GetMapping("/search")
    public List<EventResponse> searchEvents(@RequestParam double latitude, @RequestParam double longitude) {
        String csvFile = "/home/jennifer/Documentos/Pessoal/Wplex_test/csv-index/data/eventlog.csv";
        List<Event> events = readEvents(csvFile);
        List<Event> nearbyEvents = findNearbyEvents(events, latitude, longitude, 50.0);

        nearbyEvents.sort(Comparator.comparing(Event::getTimestamp));

        List<EventResponse> responses = new ArrayList<>();
        for (Event event : nearbyEvents) {
            double distance = calculateDistance(latitude, longitude, event.getLatitude(), event.getLongitude());
            EventResponse.Payload payload = parsePayload(event.getPayload());
            responses.add(new EventResponse(event.getDeviceId(), distance, event.getTimestamp(), payload));
        }
        return responses;
    }

    private List<Event> readEvents(String csvFile) {
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

    private List<Event> findNearbyEvents(List<Event> events, double targetLat, double targetLon, double radiusMeters) {
        List<Event> nearbyEvents = new ArrayList<>();
        for (Event event : events) {
            double distance = calculateDistance(targetLat, targetLon, event.getLatitude(), event.getLongitude());
            if (distance <= radiusMeters) {
                nearbyEvents.add(event);
            }
        }
        return nearbyEvents;
    }

    private double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        GeodeticCalculator calc = new GeodeticCalculator();
        calc.setStartingGeographicPoint(lon1, lat1);
        calc.setDestinationGeographicPoint(lon2, lat2);
        return calc.getOrthodromicDistance();
    }

    private EventResponse.Payload parsePayload(String payload) {
        String[] parts = payload.split(",");
        String type = parts[0].substring(1);
        String date = parts[1].substring(0, 2) + "/" + parts[1].substring(2, 4) + "/" + "20" + parts[1].substring(4, 6);
        String time = parts[1].substring(6, 8) + ":" + parts[1].substring(8, 10) + ":" + parts[1].substring(10);
        double latitude = Double.parseDouble(parts[2]);
        double longitude = Double.parseDouble(parts[3].substring(0, parts[3].length() - 1));
        return new EventResponse.Payload(type, date, time, latitude, longitude);
    }
}
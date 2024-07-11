package com.csv_coordinates.csv_coordinates;

public class Event {
    private String deviceId;
    private String eventId;
    private String timestamp;
    private double latitude;
    private double longitude;
    private String payload;
    private String company;

    public Event(String deviceId, String eventId, String timestamp, double latitude, double longitude, String payload,
            String company) {
        this.deviceId = deviceId;
        this.eventId = eventId;
        this.timestamp = timestamp;
        this.latitude = latitude;
        this.longitude = longitude;
        this.payload = payload;
        this.company = company;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public String getEventId() {
        return eventId;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public String getPayload() {
        return payload;
    }

    public String getCompany() {
        return company;
    }
}

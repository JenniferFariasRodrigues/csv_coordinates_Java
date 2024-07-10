package com.csv_coordinates.csv_coordinates;

public class EventResponse {
    private String deviceId;
    private double distance;
    private String timestamp;
    private String payload;

    public EventResponse(String deviceId, double distance, String timestamp, String payload) {
        this.deviceId = deviceId;
        this.distance = distance;
        this.timestamp = timestamp;
        this.payload = payload;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public double getDistance() {
        return distance;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public String getPayload() {
        return payload;
    }
}

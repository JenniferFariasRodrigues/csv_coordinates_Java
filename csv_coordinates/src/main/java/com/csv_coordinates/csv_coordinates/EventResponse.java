package com.csv_coordinates.csv_coordinates;

public class EventResponse {
    private String deviceId;
    private double distance;
    private String timestamp;
    private Payload payload;

    public EventResponse(String deviceId, double distance, String timestamp, Payload payload) {
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

    public Payload getPayload() {
        return payload;
    }

    public static class Payload {
        private String type;
        private String date;
        private String time;
        private double latitude;
        private double longitude;

        public Payload(String type, String date, String time, double latitude, double longitude) {
            this.type = type;
            this.date = date;
            this.time = time;
            this.latitude = latitude;
            this.longitude = longitude;
        }

        public String getType() {
            return type;
        }

        public String getDate() {
            return date;
        }

        public String getTime() {
            return time;
        }

        public double getLatitude() {
            return latitude;
        }

        public double getLongitude() {
            return longitude;
        }
    }
}

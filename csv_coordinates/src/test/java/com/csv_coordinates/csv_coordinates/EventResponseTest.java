// package com.csv_coordinates.csv_coordinates;

// import static org.junit.jupiter.api.Assertions.*;

// import org.junit.jupiter.api.Test;

// public class EventResponseTest {
// 	@Test
// 	public void EventResponse() {
// 		String deviceId = "abc";
// 		double distance = 123.4D;
// 		String timestamp = "abc";
// 		EventResponse.Payload payload = new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D);
// 		com.csv_coordinates.csv_coordinates.EventResponse expected = new com.csv_coordinates.csv_coordinates.EventResponse("abc", 123.4D, "abc", new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D));
// 		com.csv_coordinates.csv_coordinates.EventResponse actual = new com.csv_coordinates.csv_coordinates.EventResponse(deviceId, distance, timestamp, payload);

// 		assertEquals(expected, actual);
// 	}

// 	@Test
// 	public void EventResponseTODO() {
// 		String deviceId = "abc";
// 		double distance = 123.4D;
// 		String timestamp = "abc";
// 		EventResponse.Payload payload = new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D);
// 		com.csv_coordinates.csv_coordinates.EventResponse expected = new com.csv_coordinates.csv_coordinates.EventResponse("abc", 123.4D, "abc", new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D));
// 		com.csv_coordinates.csv_coordinates.EventResponse actual = new com.csv_coordinates.csv_coordinates.EventResponse(deviceId, distance, timestamp, payload);

// 		assertEquals(expected, actual);
// 	}

// 	@Test
// 	public void getDeviceId() {
// 		com.csv_coordinates.csv_coordinates.EventResponse e = new com.csv_coordinates.csv_coordinates.EventResponse("abc", 123.4D, "abc", new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D));
// 		String expected = "abc";
// 		String actual = e.getDeviceId();

// 		assertEquals(expected, actual);
// 	}

// 	@Test
// 	public void getDistance() {
// 		com.csv_coordinates.csv_coordinates.EventResponse e = new com.csv_coordinates.csv_coordinates.EventResponse("abc", 123.4D, "abc", new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D));
// 		double expected = 123.4D;
// 		double actual = e.getDistance();

// 		assertEquals(expected, actual, 0.0000001D);
// 	}

// 	@Test
// 	public void getTimestamp() {
// 		com.csv_coordinates.csv_coordinates.EventResponse e = new com.csv_coordinates.csv_coordinates.EventResponse("abc", 123.4D, "abc", new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D));
// 		String expected = "abc";
// 		String actual = e.getTimestamp();

// 		assertEquals(expected, actual);
// 	}

// 	@Test
// 	public void getPayload() {
// 		com.csv_coordinates.csv_coordinates.EventResponse e = new com.csv_coordinates.csv_coordinates.EventResponse("abc", 123.4D, "abc", new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D));
// 		EventResponse.Payload expected = new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D);
// 		EventResponse.Payload actual = e.getPayload();

// 		assertEquals(expected, actual);
// 	}

// 	@Test
// 	public void payloadPayload() {
// 		String type = "abc";
// 		String date = "abc";
// 		String time = "abc";
// 		double latitude = 123.4D;
// 		double longitude = 123.4D;
// 		EventResponse.Payload expected = new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D);
// 		EventResponse.Payload actual = new EventResponse.Payload(type, date, time, latitude, longitude);

// 		assertEquals(expected, actual);
// 	}

// 	@Test
// 	public void payloadGetType() {
// 		EventResponse.Payload p = new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D);
// 		String expected = "abc";
// 		String actual = p.getType();

// 		assertEquals(expected, actual);
// 	}

// 	@Test
// 	public void payloadGetDate() {
// 		EventResponse.Payload p = new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D);
// 		String expected = "abc";
// 		String actual = p.getDate();

// 		assertEquals(expected, actual);
// 	}

// 	@Test
// 	public void payloadGetLatitude() {
// 		EventResponse.Payload p = new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D);
// 		double expected = 123.4D;
// 		double actual = p.getLatitude();

// 		assertEquals(expected, actual, 0.0000001D);
// 	}

// 	@Test
// 	public void payloadGetLongitude() {
// 		EventResponse.Payload p = new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D);
// 		double expected = 123.4D;
// 		double actual = p.getLongitude();

// 		assertEquals(expected, actual, 0.0000001D);
// 	}
// }

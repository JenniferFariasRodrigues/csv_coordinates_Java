// package com.csv_coordinates.csv_coordinates;

// import org.junit.jupiter.api.*;
// import static org.junit.jupiter.api.Assertions.*;

// public class EventTest {
// 	@Test
// 	public void Event() {
// 		String deviceId = "abc";
// 		String eventId = "abc";
// 		String timestamp = "abc";
// 		double latitude = 123.4D;
// 		double longitude = 123.4D;
// 		String payload = "abc";
// 		String company = "abc";
// 		Event expected = new Event("abc", "abc", "abc", 123.4D, 123.4D, "abc", "abc");
// 		Event actual = new Event(deviceId, eventId, timestamp, latitude, longitude, payload, company);

// 		assertEquals(expected, actual);
// 	}

// 	@Test
// 	public void getDeviceId() {
// 		Event e = new Event("abc", "abc", "abc", 123.4D, 123.4D, "abc", "abc");
// 		String expected = "abc";
// 		String actual = e.getDeviceId();

// 		assertEquals(expected, actual);
// 	}

// 	@Test
// 	public void getEventId() {
// 		Event e = new Event("abc", "abc", "abc", 123.4D, 123.4D, "abc", "abc");
// 		String expected = "abc";
// 		String actual = e.getEventId();

// 		assertEquals(expected, actual);
// 	}

// 	@Test
// 	public void getTimestamp() {
// 		Event e = new Event("abc", "abc", "abc", 123.4D, 123.4D, "abc", "abc");
// 		String expected = "abc";
// 		String actual = e.getTimestamp();

// 		assertEquals(expected, actual);
// 	}

// 	@Test
// 	public void getLatitude() {
// 		Event e = new Event("abc", "abc", "abc", 123.4D, 123.4D, "abc", "abc");
// 		double expected = 123.4D;
// 		double actual = e.getLatitude();

// 		assertEquals(expected, actual, 0.0000001D);
// 	}

// 	@Test
// 	public void getLongitude() {
// 		Event e = new Event("abc", "abc", "abc", 123.4D, 123.4D, "abc", "abc");
// 		double expected = 123.4D;
// 		double actual = e.getLongitude();

// 		assertEquals(expected, actual, 0.0000001D);
// 	}

// 	@Test
// 	public void getPayload() {
// 		Event e = new Event("abc", "abc", "abc", 123.4D, 123.4D, "abc", "abc");
// 		String expected = "abc";
// 		String actual = e.getPayload();

// 		assertEquals(expected, actual);
// 	}

// 	@Test
// 	public void getCompany() {
// 		Event e = new Event("abc", "abc", "abc", 123.4D, 123.4D, "abc", "abc");
// 		String expected = "abc";
// 		String actual = e.getCompany();

// 		assertEquals(expected, actual);
// 	}
// }

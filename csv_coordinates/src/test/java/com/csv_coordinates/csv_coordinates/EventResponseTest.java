// package com.csv_coordinates.csv_coordinates;

// import static org.junit.jupiter.api.Assertions.*;

// import org.junit.jupiter.api.Test;

// class EventResponseTest {
// 	@Test
// 	void EventResponse() {
// 		String deviceId = "abc";
// 		double distance = 123.4D;
// 		String timestamp = "abc";
// 		EventResponse.Payload payload = new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D);
// 		EventResponse expected = new EventResponse("abc", 123.4D, "abc", new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D));
// 		EventResponse actual = new EventResponse(deviceId, distance, timestamp, payload);

// 		assertEquals(expected, actual);
// 	}

// 	@Test
// 	void getDistance() {
// 		EventResponse e = new EventResponse("abc", 123.4D, "abc", new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D));
// 		double expected = 123.4D;
// 		double actual = e.getDistance();

// 		assertEquals(expected, actual, 0.0000001D);
// 	}

// 	@Test
// 	void getTimestamp() {
// 		EventResponse e = new EventResponse("abc", 123.4D, "abc", new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D));
// 		String expected = "abc";
// 		String actual = e.getTimestamp();

// 		assertEquals(expected, actual);
// 	}

// 	@Test
// 	void getPayload() {
// 		EventResponse e = new EventResponse("abc", 123.4D, "abc", new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D));
// 		EventResponse.Payload expected = new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D);
// 		EventResponse.Payload actual = e.getPayload();

// 		assertEquals(expected, actual);
// 	}

// 	@Test
// 	void payloadGetType() {
// 		EventResponse.Payload p = new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D);
// 		String expected = "abc";
// 		String actual = p.getType();

// 		assertEquals(expected, actual);
// 	}

// 	@Test
// 	void payloadGetDate() {
// 		EventResponse.Payload p = new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D);
// 		String expected = "abc";
// 		String actual = p.getDate();

// 		assertEquals(expected, actual);
// 	}

// 	@Test
// 	void payloadGetTime() {
// 		EventResponse.Payload p = new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D);
// 		String expected = "abc";
// 		String actual = p.getTime();

// 		assertEquals(expected, actual);
// 	}

// 	@Test
// 	void payloadGetLatitude() {
// 		EventResponse.Payload p = new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D);
// 		double expected = 123.4D;
// 		double actual = p.getLatitude();

// 		assertEquals(expected, actual, 0.0000001D);
// 	}

// 	@Test
// 	void payloadGetLongitude() {
// 		EventResponse.Payload p = new EventResponse.Payload("abc", "abc", "abc", 123.4D, 123.4D);
// 		double expected = 123.4D;
// 		double actual = p.getLongitude();

// 		assertEquals(expected, actual, 0.0000001D);
// 	}
// }

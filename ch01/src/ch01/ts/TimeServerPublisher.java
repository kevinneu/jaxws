package ch01.ts;

import javax.xml.ws.Endpoint;

public class TimeServerPublisher {
	public static void main(String[] args) {
		try {
			Endpoint.publish("http://127.0.0.1:6789/ts", new TimeServerImpl());
		} catch (Exception e) {
			System.out.println(e.toString());
		}
	}
}
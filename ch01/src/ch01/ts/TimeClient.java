package ch01.ts;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

class TimeClient {
	public static void main(String args[]) throws Exception {
		URL url = new URL("http://127.0.0.1:6789/ts?wsdl");
		
		QName qname = new QName("http://ts.ch01/", "TimeServerImplService");
		
		Service service = Service.create(url, qname);
		
		TimeServer eif = service.getPort(TimeServer.class);
		
		System.out.println(eif.getTimeAsElapsed());
		System.out.println(eif.getTimeAsString());
	}
}
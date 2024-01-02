package ws;

import jakarta.xml.ws.Endpoint;

public class ServerWS {
    public static void main(String[] args) {
        Endpoint.publish("http://0.0.0.0:8080/",new BanqueService());
        System.out.println("Web Service Started....");
    }
}

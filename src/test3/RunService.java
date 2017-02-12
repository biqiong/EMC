package test3;

import javax.xml.ws.Endpoint;

public class RunService {
    /**
     * @paramargs
     */
    public static void main(String[] args) {
        System.out.println("Monitor StorageArray Web Service started.");
        Endpoint.publish("http://localhost:1080/wsServerExample",
                new StorageArray());
    }
}

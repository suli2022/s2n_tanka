package models;

public class Restapi {

    public Restapi() {
    }
    public void getEmployees() {
        HttpClient http = new HttpClient();
        String host = "http://localhost:3000/";
        String endpoint = "employees";
        String urlStr = host + endpoint;
        String res = http.get(urlStr);
        System.out.println(res);
    }
    
}

package eci.arep.proxy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
@RequestMapping("/")
public class ProxyController {

    private static final String USER_AGENT = "Mozilla/5.0";

    @GetMapping("/proxy")
    public String handleRequest(@RequestParam String path) throws IOException {
        return redirectRequest(path);
    }

    private String redirectRequest(String path) throws IOException {
        String targetUrl = "";

        if (path.startsWith("/collatzsequence")) {

            try{
                targetUrl = "http://localhost:8081/collatzsequence?value=" + path.split("=")[1];
                System.out.println("Se ejecutó correctamente el servidor");
            }catch(Exception e){
                targetUrl = "http://localhost:8081/collatzsequence?value=" + path.split("=")[1];
                System.out.println("No se pudo correr el primer servidor por lo que se optó por correr el segundo servidor");
            }
        } 
        URL url = new URL(targetUrl);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        con.setRequestProperty("User-Agent", USER_AGENT);

        int responseCode = con.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
                String inputLine;
                StringBuilder response = new StringBuilder();
                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();

                return response.toString();
            }
        } else {
            System.out.println("GET request not worked");
            return "";
        }

    }
}

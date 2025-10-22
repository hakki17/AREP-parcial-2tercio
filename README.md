# AREP-parcial-2tercio

sudo kill -9 $(sudo lsof -t -i:8080)































String targetUrl = "";

        if (path.startsWith("/collatzsequence")) {
            int idx;
            synchronized (this) {
                idx = currentServer % 2;
                currentServer++;
            }

            if (idx == 0) {
                targetUrl = "http://localhost:8081/collatzsequence?value=" + path.split("=")[1];
                System.out.println("1");
            }else{
                targetUrl = "http://localhost:8082/collatzsequence?value=" + path.split("=")[1];
                System.out.println("2");
            }
        } 



















        // package eci.arep.proxy;

// import java.io.BufferedReader;
// import java.io.IOException;
// import java.io.InputStreamReader;
// import java.net.HttpURLConnection;
// import java.net.URL;

// import org.springframework.web.bind.annotation.CrossOrigin;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.bind.annotation.RestController;

// @RestController
// @CrossOrigin("*")
// @RequestMapping("/")
// public class ProxyController {

//     @GetMapping("/proxy")
//     public String handleRequest(@RequestParam String path) throws IOException {
//         return redirectRequest(path);
//     }

//     private String redirectRequest(String path) throws IOException {
        
//         URL url = new URL(targetUrl);
//         HttpURLConnection con = (HttpURLConnection) url.openConnection();
//         con.setRequestMethod("GET");
//         con.setRequestProperty("User-Agent", "Mozilla/5.0");

//         int responseCode = con.getResponseCode();
//         if (responseCode == HttpURLConnection.HTTP_OK) {
//             try (BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()))) {
//                 String inputLine;
//                 StringBuilder response = new StringBuilder();
//                 while ((inputLine = in.readLine()) != null) {
//                     response.append(inputLine);
//                 }
//                 in.close();

//                 return response.toString();
//             }
//         } else {
//             System.out.println("GET request not worked");
//             return "";
//         }

//     }
// }

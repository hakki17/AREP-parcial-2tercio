package eci.arep.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    
    @GetMapping("/collatzsequence")
    public String ConjeturadeCollatz(@RequestParam String value) {
        return "{\"operation\":\"COLLATZ\", \"input\": " + value + ", \"output\": \"" + Collatz(value) + "\"}";
    }
    
    private String Collatz(String value) {
        int n = Integer.parseInt(value);
        String k = "" + n;
        
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            k = k + " , " + n;
        }
        
        return k;
    }

}
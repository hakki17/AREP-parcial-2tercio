package eci.arep.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {
    
    @GetMapping("/collatzsequence")
    public String collatzSequence(@RequestParam String value) {
        return "{\"operation\":\"COLLATZ\", \"input\": " + value + ", \"output\": \"" + Collatz(value) + "\"}";
    }
    
    private String Collatz(String value) {
        int n = Integer.parseInt(value);
        String sequence = "" + n;
        
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            sequence = sequence + "," + n;
        }
        
        return sequence;
    }

}
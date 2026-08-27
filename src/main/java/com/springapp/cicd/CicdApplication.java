package com.springapp.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Optional;

@SpringBootApplication
public class CicdApplication {
    public static void main(String[] args) {
        SpringApplication.run(CicdApplication.class, args);
    }
}

@RestController
class HelloController {
    @GetMapping("/hello")
    public Map<String, ResponseEntity<String>> hello() {
        return Map.of("Message",ResponseEntity.ok("Successful Hello"));
    }
}
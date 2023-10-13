package com.example.tpspringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class TpspringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpspringbootApplication.class, args);
    }
}

@RestController
class HelloWorldController {
    // GET HTTP Method
    // http://localhost:8000/hello-world
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }
}




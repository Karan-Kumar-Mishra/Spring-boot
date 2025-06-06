package com.example.demo;
import org.springframework.web.bind.annotation.*;

@RestController

@RequestMapping("/api") 
public class MyController {
    
    @GetMapping("/hello")
    public String sayHello() {
        return "Hello, Spring Boot!";
    }
    @GetMapping("/test")
    public String check() {
        return "Hello, Spring Boot! app working";
    }
    

}
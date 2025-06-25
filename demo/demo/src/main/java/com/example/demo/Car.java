package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Car {
    @Autowired
  
    public info ifo;
    
    @GetMapping("/ok")
    public User ok()
    {
        return ifo.get();
        
    }
}

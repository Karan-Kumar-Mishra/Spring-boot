package com.rest_api.rest_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class RestControl {
    @GetMapping("/helth")
    public String healthCheck() {
        return "ok";
    }

    @GetMapping("/get")
    public Students get() {
        Students student = new Students();
        student.setName("John Doe");
        student.setAge(25);
        return student;
        // return new Students();
    }

    @PostMapping("/set")
    public boolean set(@RequestBody Students data) {
        Students student = new Students();
        student.setName(data.getName());
        student.setAge(data.getAge());
        return true;
    }
}

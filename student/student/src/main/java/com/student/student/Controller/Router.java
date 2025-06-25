package com.student.student.Controller;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Router {
    
    @Autowired
    private Repo repo;

    @Autowired
    private Control ctrl;

    @GetMapping
    public List<Student> getAll()
    {
      return ctrl.getAll();
    }

    @PostMapping
    public boolean createEntry(@RequestBody Student st)
    {
     ctrl.saveEntry(st);
     return true;
    }


    @PostMapping("id/{myId}")
    public Optional<Student> getStudentById(@PathVariable String myId)
    {
       return repo.findById(myId);
    }

    @DeleteMapping("id/{myId}")
    public Boolean deleteStudent(@PathVariable Object myId)
    {
      repo.deleteById(myId.toString());
      return true;
    }
}

package com.example.springsecurity.controller;

import com.example.springsecurity.model.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/students")
public class SecurityAPI {

    @GetMapping(path="{studentId}")
    public Student findStudent(@PathVariable("studentId") int id)
    {
        return new Student(1,"JayR");
    }

}

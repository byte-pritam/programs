package com.programs.controller;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonIgnoreController {

    @GetMapping("/test")
    public Student test(){

        Student student = new Student("pritam",323,"Male","903874654");
        //Student student = new Student("pritam",323,"Male","903874654");
        return student;
    }
}

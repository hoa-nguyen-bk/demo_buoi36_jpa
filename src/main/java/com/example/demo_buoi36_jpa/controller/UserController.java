package com.example.demo_buoi36_jpa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {
    @Autowired
    @GetMapping
    public ResponseEntity<?> getUser(){
        return new ResponseEntity<>("", HttpStatus.OK);
    }
}

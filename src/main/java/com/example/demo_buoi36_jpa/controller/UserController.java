package com.example.demo_buoi36_jpa.controller;

import com.example.demo_buoi36_jpa.entity.Users;
import com.example.demo_buoi36_jpa.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserRepository usersRepository;

    @GetMapping
    public ResponseEntity<?> getUser(){
        List<Users> listUser = usersRepository.findAll();
        return ResponseEntity.ok(listUser);
    }
}

package com.haidoan.english.controller;

import com.haidoan.english.entity.User;
import com.haidoan.english.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class RootController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}

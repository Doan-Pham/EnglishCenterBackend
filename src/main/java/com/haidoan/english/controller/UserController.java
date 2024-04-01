package com.haidoan.english.controller;

import com.haidoan.english.entity.User;
import com.haidoan.english.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/login")
    public boolean login(@RequestParam String username, @RequestParam String password) {
        User user = userRepository.findByUsernameAndPassword(username, password);
        return user != null;
    }
}

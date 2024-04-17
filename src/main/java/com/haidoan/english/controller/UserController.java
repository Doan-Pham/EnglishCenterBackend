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

    @GetMapping("/all")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @GetMapping("/role/{userId}")
    public String getUserRoleName(@PathVariable Long userId) {
        User user = userRepository.findByUserId(userId);
        if (user != null && user.getRole() != null) {
            return user.getRole().getName();
        }
        return null;
    }

    @GetMapping("/role")
    public String getUserRoleName(@RequestParam String username, @RequestParam String password) {
        User user = userRepository.findByUsernameAndPassword(username, password);
        if (user != null && user.getRole() != null) {
            return user.getRole().getName();
        }
        return null;
    }

    @PostMapping("/add")
    public void addUser(@RequestBody User newUser) {
        userRepository.save(newUser);
    }

    @DeleteMapping("/delete/{userId}")
    public void deleteUser(@PathVariable Long userId) {
        userRepository.deleteById(userId);
    }

    @GetMapping("/filter")
    public List<User> getFilteredUser(@RequestParam String info) {
        return userRepository.findByUsernameContaining(info);
    }

    @PutMapping("/update")
    public void updateUser(@RequestBody User updatedUser) {
        userRepository.save(updatedUser);
    }
}

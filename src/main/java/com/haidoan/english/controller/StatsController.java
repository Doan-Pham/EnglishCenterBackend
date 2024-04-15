package com.haidoan.english.controller;

import com.haidoan.english.repository.ClassRepository;
import com.haidoan.english.repository.CourseRepository;
import com.haidoan.english.repository.EmployeeRepository;
import com.haidoan.english.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping("/api/stats")
public class StatsController {

    @Autowired
    private CourseRepository courseRepository;

    @Autowired
    private ClassRepository classRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/counts")
    public HashMap<String, Long> getEntityCounts() {
        HashMap<String, Long> counts = new HashMap<>();
        counts.put("courseCount", courseRepository.count());
        counts.put("classCount", classRepository.count());
        counts.put("studentCount", studentRepository.count());
        counts.put("employeeCount", employeeRepository.count());
        return counts;
    }
}


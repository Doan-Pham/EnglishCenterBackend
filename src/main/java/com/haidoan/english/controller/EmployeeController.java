package com.haidoan.english.controller;

import com.haidoan.english.entity.Employee;
import com.haidoan.english.repository.EmployeeRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeController(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @GetMapping("/teachers")
    public List<Employee> getAllTeachers() {
        return employeeRepository.findByRoleName("teacher");
    }

    @GetMapping("/teachers/count")
    public int getNumberOfTeachers() {
        return employeeRepository.countByRoleName("teacher");
    }

//    @GetMapping("/{id}/role")
//    public String getEmployeeRoleName(@PathVariable Long id) {
//        employeeRepository.findById(id).
//        return null;
//    }

    @PostMapping("/add")
    public void addEmployee(@RequestBody Employee newEmployee) {
        System.out.println("addEmployee " + newEmployee);

        employeeRepository.save(newEmployee);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeRepository.deleteById(id);
    }

    @PutMapping("/{id}")
    public void updateEmployee(@PathVariable Long id, @RequestBody Employee updatedEmployee) {
        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("Employee not found with id: " + id));

        // Copy updated properties to the existing employee
        BeanUtils.copyProperties(updatedEmployee, existingEmployee, "employeeId");

        employeeRepository.save(existingEmployee);
    }

    @GetMapping("/search")
    public List<Employee> searchEmployees(@RequestParam(required = false) String query) {
        if (query == null || query.isEmpty()) {
            return employeeRepository.findAll(); // Return all employees if no query provided
        } else {
            return employeeRepository.findByFirstNameLastName(query, query);
        }
    }

}


package com.haidoan.english.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.haidoan.english.entity.Employee;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findByRoleName(String roleName);
    int countByRoleName(String roleName);

    List<Employee> findByFirstName(String firstName);
    // Add other custom query methods here if needed
}


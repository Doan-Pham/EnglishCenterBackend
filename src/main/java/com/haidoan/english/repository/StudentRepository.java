package com.haidoan.english.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.haidoan.english.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}

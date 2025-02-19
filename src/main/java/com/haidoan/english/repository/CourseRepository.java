package com.haidoan.english.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.haidoan.english.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
}

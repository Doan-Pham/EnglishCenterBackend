package com.haidoan.english.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.haidoan.english.entity.Class;

@Repository
public interface ClassRepository extends JpaRepository<Class, Long> {
}


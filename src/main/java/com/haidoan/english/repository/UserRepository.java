package com.haidoan.english.repository;

import com.haidoan.english.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAll();

    User findByUserId(Long userId);

    User findByUsernameAndPassword(String username, String password);

    List<User> findByUsernameContaining(String username);
}

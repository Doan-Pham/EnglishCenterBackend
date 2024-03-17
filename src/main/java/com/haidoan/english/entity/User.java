package com.haidoan.english.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "USERS")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "UserID")
    private Long userId;

    @ManyToOne
    @JoinColumn(name = "RoleID")
    private Role role;

    @Column(name = "Username")
    private String username;

    @Column(name = "Password")
    private String password;
}

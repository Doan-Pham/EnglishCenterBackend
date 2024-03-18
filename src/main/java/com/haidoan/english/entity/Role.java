package com.haidoan.english.entity;

import jakarta.persistence.*;
import lombok.*;
import jakarta.persistence.*;

@Entity
@Table(name = "ROLE")
@Data
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RoleID")
    private Long roleId;

    @Column(name = "Name")
    private String name;

    @Column(name = "Description")
    private String description;
}

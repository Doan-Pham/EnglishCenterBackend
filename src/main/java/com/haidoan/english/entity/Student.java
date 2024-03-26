package com.haidoan.english.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Table(name = "STUDENT")
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "StudentID")
    private Long studentId;

    @ManyToOne
    @JoinColumn(name = "ClassID")
    private Class studentClass;

    @Column(name = "FirstName")
    private String firstName;

    @Column(name = "LastName")
    private String lastName;

    @Column(name = "Address")
    private String address;

    @Column(name = "DateOfBirth")
    private Date dateOfBirth;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "AverageGrade")
    private Float averageGrade;
}


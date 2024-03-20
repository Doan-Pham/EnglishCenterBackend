package com.haidoan.english.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;

@Entity
@Table(name = "EMPLOYEE")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EmployeeID")
    private Long employeeId;

    @ManyToOne
    @JoinColumn(name = "RoleID")
    private Role role;

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

    @Column(name = "Certificate")
    private String certificate;

    @Column(name = "Email")
    private String email;

    @OneToOne
    @JoinColumn(name = "UserID")
    private User user;
}

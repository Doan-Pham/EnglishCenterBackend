package com.haidoan.english.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "COURSE")
@Data
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CourseID")
    private Long courseId;

    @ManyToOne
    @JoinColumn(name = "GradeSchemeID")
    private GradeScheme gradeScheme;

    @Column(name = "Name")
    private String name;

    @Column(name = "Description")
    private String description;

    @Column(name = "NumberOfLessons")
    private Integer numberOfLessons;

    @Column(name = "NumberOfWeeks")
    private Integer numberOfWeeks;

    @Column(name = "Tuition")
    private Integer tuition;

    @Column(name = "StandardGrade")
    private Float standardGrade;
}
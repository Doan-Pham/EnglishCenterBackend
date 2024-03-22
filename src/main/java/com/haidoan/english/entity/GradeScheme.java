package com.haidoan.english.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "GRADESCHEME")
@Data
public class GradeScheme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "GradeSchemeID")
    private Long gradeSchemeId;

    @Column(name = "Name")
    private String name;

    @Column(name = "LowestGrade")
    private Float lowestGrade;

    @Column(name = "HighestGrade")
    private Float highestGrade;

    @Column(name = "Rounding")
    private Float rounding;
}

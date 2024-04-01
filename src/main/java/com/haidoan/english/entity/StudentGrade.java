package com.haidoan.english.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Entity
@Table(name = "STUDENTGRADE")
@IdClass(StudentGradeId.class)
@Data
public class StudentGrade {

    @Id
    @ManyToOne
    @JoinColumn(name = "StudentID")
    private Student student;

    @Id
    @ManyToOne
    @JoinColumn(name = "ClassID")
    private Class studentClass;

    @Column(name = "TestName")
    private String testName;

    @Column(name = "Grade")
    private Float grade;
}

@Data
class StudentGradeId implements Serializable {
    private Long student;
    private Long studentClass;
}

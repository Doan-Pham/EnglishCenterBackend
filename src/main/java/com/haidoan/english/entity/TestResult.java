package com.haidoan.english.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Table(name = "TESTRESULT")
@IdClass(TestResultId.class)
@Data
public class TestResult {

    @Id
    @ManyToOne
    @JoinColumn(name = "TestID")
    private Test test;

    @Id
    @ManyToOne
    @JoinColumn(name = "StudentID")
    private Student student;

    @Column(name = "Grade")
    private Float grade;
}


@Data
class TestResultId implements Serializable {
    private Long test;
    private Long student;

}

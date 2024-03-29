package com.haidoan.english.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "TEST")
@Data
public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TestID")
    private Long testId;

    @ManyToOne
    @JoinColumn(name = "ClassID")
    private Class studentClass;

    @Column(name = "Name")
    private String name;

    @Column(name = "TestDate")
    private Date testDate;

    @Column(name = "StartTime")
    private Time startTime;

    @Column(name = "EndTime")
    private Time endTime;

    @Column(name = "Room")
    private String room;

    @Column(name = "NumberOfExaminees")
    private Integer numberOfExaminees;

    @Column(name = "Type")
    private Integer type;
}


package com.example.CRUD.SQL.App.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "student")
// @Getter
// @Setter
// @NoArgsConstructor
// @AllArgsConstructor
// @ToString
// @Builder 
@Data
public class student 
{
    // //field for database table
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int rollno;
    @Column(name = "Student_name")
    private String name;
    @Column(name = "Student_bracnh")
    private String branch;
    @Column(name = "Student_percentage")
    private float percentage;




}


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


    // //deafault constructor
    // public student() {
    //     super();
    // }

    // //parameterized constructor
    // public student(String name, String branch, float percentage) {
    //     this.name = name;
    //     this.branch = branch;
    //     this.percentage = percentage;
    // }
    // //Creating Getter and setter
    // public int getRollno() {
    //     return rollno;
    // }

    // public void setRollno(int rollno) {
    //     this.rollno = rollno;
    // }
    // public String getName() {
    //     return name;
    // }
    // public void setName(String name) {
    //     this.name = name;
    // }
    // public String getBranch() {
    //     return branch;
    // }
    // public void setBranch(String branch) {
    //     this.branch = branch;
    // }
    // public float getPercentage() {
    //     return percentage;
    // }
    // public void setPercentage(float percentage) {
    //     this.percentage = percentage;
    // }

    // //to string method
    // @Override
    // public String toString() {
    //     return "student [rollno=" + rollno + ", name=" + name + ", branch=" + branch + ", percentage=" + percentage
    //             + "]";
    // }


}


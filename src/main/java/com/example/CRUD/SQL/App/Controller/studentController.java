package com.example.CRUD.SQL.App.Controller;

import java.util.List;

import com.example.CRUD.SQL.App.Entity.student;
import com.example.CRUD.SQL.App.Repository.studentRepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.http.HttpStatus;

@RestController
public class studentController {
     @Autowired
     studentRepo repo; //to access the studentRepo interface
    //get all the students
    @GetMapping("/students") //localhost:8080/students,Method=GET

    public List<student> getAllStudents() {
        List<student> students=repo.findAll();
        return students;
    }

    //get student by rollno
    @GetMapping("/students/{id}") //localhost:8080/students/1,Method=GET
    public student getStudentById(@PathVariable int id) {
        student Student = repo.findById(id).orElse(null); //student is the object of student class, Student is the reference variable to store the particular student detail
        return Student;
    } 

    //Add new student
    @PostMapping("/students") //localhost:8080/students,mehtod=Post
    @ResponseStatus(code=HttpStatus.CREATED) //to show created instead of 200 OK
    public void createStudent(@RequestBody student Student) {
        repo.save(Student); //save the student object in the database
    }


    //Update student
    @PutMapping("/students/{id}") //localhost:8080/students/1,Method=PUT
    @ResponseStatus(code=HttpStatus.OK) //to show updated instead of 200 OK
    public student updateStudent(@PathVariable int id, @RequestBody student Student) {
    student existingStudent = repo.findById(id).orElse(null); //find the student by id,existingStudent is the reference variable to find and update the particular student detail
    existingStudent.setName("Vivek");
    existingStudent.setPercentage(56);
    repo.save(existingStudent);
    return existingStudent; //return the updated student object
    }
    


    //Delete Particuler student Data
    @DeleteMapping("/students/{id}") //localhost:8080/students/1,Method=DELETE
    public void removeStudent(@PathVariable int id) {
        student Student = repo.findById(id).orElse(null); //find the student by id
        repo.delete(Student); //delete the particuler student data from the database

    }
}    
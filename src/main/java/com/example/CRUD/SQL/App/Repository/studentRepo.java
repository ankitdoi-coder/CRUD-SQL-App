package com.example.CRUD.SQL.App.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.CRUD.SQL.App.Entity.student;

public interface studentRepo extends JpaRepository<student,Integer> {
    // This interface will automatically provide CRUD operations for the student entity
    // No need to write any implementation code

}

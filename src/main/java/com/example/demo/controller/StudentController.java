package com.example.practice.controller

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
public class StudentController{
    @Autowired
    StudentService st;
    @PostMapping("/add")
    public StudentEntity post(@RequestBody StudentEntity student){
        return st.saveData(student)
    }
    @GetMapping("/get")
    public List<StudentEntity>getAllStudents(){
        return st.getAllStudentEntity();
    }
    
}
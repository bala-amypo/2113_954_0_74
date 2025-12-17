package com.example.practice.controller

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import com.example.demo.service.StudentService;
import com.example.demo.entity
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
    @GetMapping("/get/{id}")
    public Optional<StudentEntity>get(@PathVariable int id){
        return st.getStudentById(id);
    }
    @PutMapping("/update/{id}")
    public String update(@RequestBody StudentEntity student,@PathVariable int id){
        Optional<StudentEntity> existingStudent=st.getStudentById(id);
        if(existingStudent.isPresent()){
            student.setId(id);
            st.insertStudent(student);
            return "Student updated successfully";
        }else{
            return "Student not found";
        }
    }
    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable int id){
        Optional<StudentEntity> student=st.getStudentById(id);
        if(student.isPresent()){
            st.deleteStudentById(id);
            return "Student deleted successfully";
        }else{
            return "Student not found";
        }
    }
}
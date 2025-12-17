package com.example.demo.service;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import com.example.demo.entity.StudentEntity;
@Service
public class StudentService{
    Map<Integer,StudentEntity> details=new HashMap<>();
    public StudentEntity saveData(StudentEntity student){
        details.put(student.getId(),student);
        return student;
    }
    public java.util.List<St>
}
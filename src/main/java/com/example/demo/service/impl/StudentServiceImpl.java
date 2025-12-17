package com.example.demo.service.impl;
import java.util.*;
import org.springframework.stereotype.Service;
import com.example.demo.entity.Student;
@Service
public class StudentServiceImpl implements StuentService{
    private final Map<Int,Student>store=new HashMap<>();
    private int counter=1;
    @Override
    public Student insertStudent(Student st){
        st.sedId(counter++);
        stor.put(st.getId(),st);
        return st;
    }
    @Override
    public List<Student>getAllStudents(){
        return new ArrayList<>(store.values());
    }
    @Override
    public Optional<Student>getOneStudent(Int id){
        return Optional.ofNullable(store.get(id));
    }
    @Override
    public void deleteStudent(Int id){
        store.remove(id);
    }
}
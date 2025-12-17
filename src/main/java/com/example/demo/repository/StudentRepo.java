package com.example.demo.repository;
import org.springframework.data.jpa.repository.Jpa-Repository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Int>{
    
}
package com.example.demo.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.StudentEntity;

@Repository
public interface Student1Repository extends JpaRepository<StudentDetails,Integer>{
    //Here StudentEntity is the databse name //Integer is the datatype of primary key

}
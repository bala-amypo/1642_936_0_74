package com.example.demo.service;

import com.example.demo.entity.StudentEntity;
//We should not use @Service 
public interface StudentService{
    //We will give method definitions in other file. We're just declaring methods here. So interface

    StudentEntity postData(StudentEntity stu);
    //studentEntity is return type 
}
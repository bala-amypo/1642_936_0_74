package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.StudentEntity;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.service.repository.StudentRepository;

@Service  //business logic layer
public class StudentServiceImpl implements StudentService{
  @Autwired StudentRepository student; //creating obj for StudentRepository to handle built in methods
  
  public StudentEntity postData(StudentEntity stu){
    return student.save(stu); //Here student is the obj of StudentRepository //stu is the input passed by the user in java objects form
  }
}

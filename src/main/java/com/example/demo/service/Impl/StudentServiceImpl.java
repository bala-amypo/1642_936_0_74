package com.example.demo.service.Impl;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;

@Service  //business logic layer
public class StudentServiceImpl implements StudentService{
  @Autwired StudentRepository student; //creating obj for StudentRepository to handle built in methods
  
  public StudentEntity postData(StudentEntity stu){
    
  }
}

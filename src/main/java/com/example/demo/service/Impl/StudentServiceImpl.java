package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.StudentEntity;
import org.springframework.stereotype.Service;
import com.example.demo.service.StudentService;
import com.example.demo.repository.StudentRepository;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
  @Autowired StudentRepository student;
  
  @Override 
  public StudentEntity postData(StudentEntity stu){
    return student.save(stu); 
  }

  @Override
  public List<StudentEntity> getAllData(){
      return student.findAll();
  }

  @Override
  public String deleteData(int id){
    student.deleteById(id);
    return "User with id "+id+" deleted successfully";
  }

  @Override
  public StudentEntity getDataById(Integer id){
     return student.findById(id);
  }
}

package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.Student1Service;
import com.example.demo.entity.StudentDetails;
import com.example.demo.repository.Student1Repository;
// import java.util.List;

@Service
public class Student1ServiceImpl implements Student1Service{
  @Autowired Student1Repository iden;
  
  @Override 
  public StudentDetails postIddData(StudentDetails ts){
    return iden.save(ts); 
  }

}

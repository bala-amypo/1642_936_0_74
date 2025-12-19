package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.StudentEntity;
import org.springframework.stereotype.Service;
import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.repository.ValidationRepository;
// import java.util.List;

@Service
public class ValidationServiceImpl implements ValidationService{
  @Autowired ValidationRepository vali;
  
  @Override 
  public ValidationEntity postData(ValidationEntity val){
    return vali.save(val); 
  }

//   @Override
//   public List<StudentEntity> getAllData(){
//       return student.findAll();
//   }

//   @Override
//   public String deleteData(int id){
//     student.deleteById(id);
//     return "User with id "+id+" deleted successfully";
//   }

  @Override
  public ValidationEntity getDataByIdd(Long id){
     return vali.findById(id);
  }

//   @Override
//   public StudentEntity updateData(int id,StudentEntity stu){
//      if(student.existsById(id)){
//       stu.setId(id);
//       return student.save(stu);
//      }
//     return null;
//   }
}

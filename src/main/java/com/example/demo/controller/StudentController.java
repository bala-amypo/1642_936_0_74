package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PutMapping;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;
import java.util.List;


@RestController
public class StudentController{
   @Autowired StudentService ser;

   @PostMapping("/post")
   public StudentEntity SendData(@RequestBody StudentEntity stu){
       return ser.postData(stu);
   }

   @GetMapping("/get")
   public List<StudentEntity> GetData(){
        return ser.getAllData();
   }

   @DeleteMapping("/delete/{id}")
   public String DeleteValue(@PathVariable int id){
    return ser.deleteData(id);
   }
   
   @GetMapping("/getid/{id}")
   public StudentEntity getDataa(@PathVariable int id){
    return ser.getDataById(id);
   }

   @PutMapping("/put/{id}")
   public StudentEntity UpdateDataByID(@PathVariable int id,@RequestBody StudentEntity stu){
    return ser.updateData(id,stu);
   }
}
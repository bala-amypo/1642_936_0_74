package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
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
   
   @GetMapping
   public StudentEntity getData(@PathVariable int id){
    return ser.getDataById(id);
   }

}
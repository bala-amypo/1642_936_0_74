package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
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

   @DeleteMapping()

}
package com.example.demo.controller;

import org.springframwork.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframwork.web.bind.annotation.PostMapping;
import com.example.demo.entity.StudentEntity;
import com.example.demo.service.StudentService;

@RestController
public class StudentController{
   @Autowired StudentService ser;

   @PostMapping("/post")
   public StudentEntity SendData(@RequestBody StudentEntity stu){
       return ser.postData(stu);
   }

}
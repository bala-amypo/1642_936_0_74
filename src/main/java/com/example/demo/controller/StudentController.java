package com.example.demo.controller;

import org.springframwork.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;


@RestController
public class StudentController{
   @Autowired StudentService ser;

   @PostMapping("/post")
   public StudentEntity SendData(@RequestBody StudentEntity stu){
       return ser.postData(stu);
   }

}
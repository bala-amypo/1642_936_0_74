package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import com.example.demo.entity.StudentDetails;
import com.example.demo.service.Student1Service;
// import java.util.List;


@RestController
public class Student1Controller{
   @Autowired Student1Service servvi;

   @PostMapping("/postIid")
   public StudentDetails SendIddData(@RequestBody StudentDetails ts){
       return servvi.postIddData(ts);
   }

}
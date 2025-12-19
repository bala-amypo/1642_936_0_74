package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import com.example.demo.entity.Timestamp;
import com.example.demo.service.TimestampService;
// import java.util.List;


@RestController
public class TimestampController{
   @Autowired TimestampService servi;

   @PostMapping("/postTimestamp")
   public StudentEntity SendData(@RequestBody StudentEntity stu){
       return servi.postData(stu);
   }

}
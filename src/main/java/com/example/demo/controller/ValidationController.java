package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.DeleteMapping;
// import org.springframework.web.bind.annotation.PutMapping;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.service.ValidationService;
import java.util.List;
import jakarta.validation.Valid;


@RestController
public class ValidationController{
   @Autowired ValidationService serv;

   @PostMapping("/validpost")
   public ValidationEntity SendData(@Valid @RequestBody ValidationEntity validate){
       return serv.postData(validate);
   }

//    @GetMapping("/get")
//    public List<ValidationEntity> GetData(){
//         return ser.getAllData();
//    }

//    @DeleteMapping("/delete/{id}")
//    public String DeleteValue(@PathVariable int id){
//     return ser.deleteData(id);
//    }
   
   @GetMapping("/getidd/{id}")
   public StudentEntity getDataa(@PathVariable int id){
    return ser.getDataById(id);
   }

//    @PutMapping("/put/{id}")
//    public StudentEntity UpdateDataByID(@PathVariable int id,@RequestBody StudentEntity stu){
//     return ser.updateData(id,stu);
//    }
}
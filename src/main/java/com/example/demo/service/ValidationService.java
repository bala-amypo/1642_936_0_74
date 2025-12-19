package com.example.demo.service;

import com.example.demo.entity.ValidationEntity;
import java.util.List;

public interface ValidationService{
   
    ValidationEntity postData(ValidationEntity validate);
    // List<ValidationEntity> getAllData();
    // String deleteData(long id);
    ValidationEntity getDataByIdd(Long id);
    // ValidationEntity updateData(long id,ValidationEntity validate);
}
package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.StudentEntity;
import org.springframework.stereotype.Service;
import com.example.demo.service.ValidationService;
import com.example.demo.entity.ValidationEntity;
import com.example.demo.repository.ValidationRepository;
import com.example.demo.exception.ValidationException;
// import java.util.List;

@Service
public class TimestampImpl implements ValidationService{
  @Autowired TimeStamp timer;
  
  @Override 
  public Timestamp postStampData(Timestamp ts){
    return timer.save(ts); 
  }

}

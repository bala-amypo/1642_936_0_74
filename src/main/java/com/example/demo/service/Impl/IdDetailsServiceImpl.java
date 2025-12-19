package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.StudentEntity;
import org.springframework.stereotype.Service;
import com.example.demo.service.IdDetailsService;
import com.example.demo.entity.IdDetails;
import com.example.demo.repository.TimestampRepository;
// import java.util.List;

@Service
public class TimestampImpl implements TimestampService{
  @Autowired TimestampRepository timer;
  
  @Override 
  public Timestamp postStampData(Timestamp ts){
    return timer.save(ts); 
  }

}

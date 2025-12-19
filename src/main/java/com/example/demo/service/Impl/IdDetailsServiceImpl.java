package com.example.demo.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.service.IdDetailsService;
import com.example.demo.entity.IdDetails;
import com.example.demo.repository.IdDetailsRepository;
// import java.util.List;

@Service
public class IdDetailsServiceImpl implements IdDetailsService{
  @Autowired IdDetailsRepository iden;
  
  @Override 
  public IdDetails postIdData(IdDetails ts){
    return iden.save(ts); 
  }

}

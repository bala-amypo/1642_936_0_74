package com.example.demo.service;

import com.example.demo.entity.Timestamp;
import java.util.List;

@Service
public interface Timestamp{
   
    Timestamp postStampData(Timestamp ts);   
}
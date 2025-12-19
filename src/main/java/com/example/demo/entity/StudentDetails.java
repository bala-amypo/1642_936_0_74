package com.example.demo.entity
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
@Entity
public class StudentDetails{
    @Id
    @GeneratedValue(GenerationType.IDENTITY)
    Long id;
    

}
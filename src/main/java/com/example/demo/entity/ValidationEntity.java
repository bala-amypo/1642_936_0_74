package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.constraints.NotNull;
import jakarta.persistence.constraints.Size;

@Entity 
public class ValidationEntity{
          @Id
          @GeneratedValue(strategy=GenerationType.IDENTITY)
          private Long id;
          @NotNull
          @Size(min=2,max=10);
          private String username;
          private String email;
          private String pwd;
          private int age;
      

}
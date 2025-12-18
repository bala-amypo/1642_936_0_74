package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.constraints.NotNull;
import jakarta.persistence.constraints.Size;
import jakarta.persistence.constraints.Email;
import jakarta.persistence.constraints.Max;
import jakarta.persistence.constraints.Positive;

@Entity 
public class ValidationEntity{
          @Id
          @GeneratedValue(strategy=GenerationType.IDENTITY)
          private Long id;
          @NotNull
          @Size(min=2,max=10,message="Username must have atleast 2 to a maximum of 10 characters")
          private String username;
          @Email(message="Email is not valid")
          private String email;
          @Max(6)
          @NotNull(message="Password is mandatory")
          private String pwd;
          @Max(35);
          @Positive
          private int age;
      

}
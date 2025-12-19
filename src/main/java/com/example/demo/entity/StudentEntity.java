package com.example.demo.entity;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lambok.Data;
import lambok.NoArgsConstructor;
import lambok.FullArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class StudentEntity{
  
          @Id
          @GeneratedValue(strategy=GenerationType.IDENTITY)
          private Integer id;
          private String username;
          private String email;
          private String pwd;
          private Date created;




}
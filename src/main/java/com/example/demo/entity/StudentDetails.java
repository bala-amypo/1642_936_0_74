package com.example.demo.entity
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class StudentDetails{
 @Id
    @GeneratedValue(GenerationType.IDENTITY)
    private Integer id;
    private String email;
    private String name;
    private String address;

}
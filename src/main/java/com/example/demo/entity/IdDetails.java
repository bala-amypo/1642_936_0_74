package com.example.demo.entity;
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
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private int cardNo;
    private int student_id;

}
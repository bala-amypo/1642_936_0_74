package com.example.demo.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import java.time.LocalDateTime;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import jakarta.persistence.Id;
import jakarta.persistence.PrePersist;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Timestamp{
     @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;

   private String name;
   private String email;
   LocalDateTime createAt;
   LocalDateTime updateAt;
   
   @PrePersist
   public void onCreate(){
    LocalDateTime now=new LocalDateTme()
    //to capture time of java obj creation
   }


}
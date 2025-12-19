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
import jakarta.persistence.PreUpdate;

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
   private LocalDateTime createAt;
   private LocalDateTime updateAt;
   
   
   @PrePersist
   public void onCreate(){
    LocalDateTime now=LocalDateTime.now();
    //to capture time of java obj creation
    this.createAt=now;
    this.updateAt=now;
   }


   @PreUpdate //called upon data update in the database
   public void onUpdate(){
    LocalDateTime now=LocalDateTime.now();
    // LocalDateTime now=LocalDateTime().now();
    this.updateAt=now;
   }



}
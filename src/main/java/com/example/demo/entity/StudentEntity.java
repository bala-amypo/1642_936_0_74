package com.example.demo.entity;

@Entity
public class StudentEntity{
          private Integer id;
          private String username;
          private String email;
          private String pwd;
          private Date created;

          public void setId(Integer id){
            this.id=id;
          }
          public void setUsername(String username){
            this.username=username;
          }
          public void setEmail(String email){
            this.email=email;
          }
           public void setPwd(String pwd){
            this.pwd=pwd;
          }
          public void setCreated(Date created){
            this.created=created;
          }
          public Integer getID(){
            return id;
          }
          public String getUsername(){
            return username;
          }
          public String getEmail(){
            return email;
          }
          public String getPwd(){
            return pwd;
          }
          public Date getCreated(){
            return created;
          }
          public StudentEntity(Integer id,String username,String email,String pwd,Date created){
            this.id=id;
            this.username=username;
            this.email=email;
            this.pwd=pwd;
            this.created=created;
          }
          public StudentEntity(){
           
          }

}
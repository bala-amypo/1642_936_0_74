package com.example.demo.repository;

import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity,Integer>{
    //Here StudentEntity is the databse name //Integer is the datatype of primary key

}
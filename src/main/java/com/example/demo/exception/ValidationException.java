package com.example.demo.exception;

public class ValidationException extends RuntimeException{
  //runtimeException has all exceptions declared in it
  public ValidationException(String message){
      super(message);
  }
}
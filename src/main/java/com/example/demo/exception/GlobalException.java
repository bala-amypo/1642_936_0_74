package com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
@RestControllerAdvice
public class GlobalException{
    @ExceptionHandler(ValidationException.class){
        //This ValidationException has the custom error msg that has to be displayed in the UI
        public ResponseData<String> handleValidationException(ValidationException ex){
             //@ResponseBody convertsd java objects to json to display the response to client
              return new ResponseBody<String>("Validation Error",ex.getMessage())
        }
    }
}
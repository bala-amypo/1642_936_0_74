package com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ResponseBody;
@RestControllerAdvice
public class GlobalException{
    @ExceptionHandler(ValidationException.class){
        //This ValidationException has the custom error msg that has to be displayed in the UI
        public String handleValidationException(){

        }
    }
}
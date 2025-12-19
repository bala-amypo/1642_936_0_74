package com.example.demo.exception;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
@RestControllerAdvice
public class GlobalException{
    @ExceptionHandler(ValidationException.class)
        //This ValidationException has the custom error msg that has to be displayed in the UI
        public ResponseEntity<String> handleValidationException(ValidationException ex){
             //@ResponseBody convertsd java objects to json to display the response to client
              return new ResponseEntity<String>(ex.getMessage(),HttpStatus.BAD_GATEWAY);
              //Which msg to display , which statuscode to display?
        
    }
}

 
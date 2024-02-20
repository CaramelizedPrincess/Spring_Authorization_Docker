package ru.netology.springauthorization.handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ru.netology.springauthorization.exeption.InvalidCredentials;
import ru.netology.springauthorization.exeption.UnauthorizedUser;

@RestControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler(InvalidCredentials.class)
    public ResponseEntity<String>InvalidCredentialsHandler(InvalidCredentials e){
        System.out.println(e.getMessage());
        return new ResponseEntity<>(e.getMessage(), HttpStatus.BAD_REQUEST);
    }
    @org.springframework.web.bind.annotation.ExceptionHandler(UnauthorizedUser.class)
    public ResponseEntity<String >UnauthorizedUserHandler(UnauthorizedUser e){
        System.out.println(e.getMessage());
        return new ResponseEntity<>(e.getMessage(),HttpStatus.UNAUTHORIZED);
    }

}
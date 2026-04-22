package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public userController hello(){
        return new userController("Shivam.","Mobile & DevOps Engineer..");
    }
}
package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    @GetMapping("/")
    public List<userController> hello(){

        List<userController> list = new ArrayList<>();

        list.add(new userController("Jon Deo.","Mobile Engineer."));
        list.add(new userController("Recherson pari.","DevOps Engineer."));
        list.add(new userController("Sam Desuja.","DevSecOps Engineer."));
        return list;
    }
}
package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Guohua Zhang
 * @create 2022-02-07 11:58 AM
 */

@RestController
public class HelloController {

    @GetMapping("/")
    public String index()
    {
        return "Greetings from Spring Boot!";
    }

//    @GetMapping("/")
//    public String index(){
//        return "Hello World!";
//    }
}

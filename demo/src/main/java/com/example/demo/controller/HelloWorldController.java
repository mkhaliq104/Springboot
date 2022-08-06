package com.example.demo.controller;

import com.example.demo.entity.HelloWorldBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello world";
    }

    @GetMapping("/hello-world-bean")
    public HelloWorldBean helloWorldBean(){
        return  new HelloWorldBean("Hello World");
    }

    @GetMapping("/hello-world-bean/{id}")
    public HelloWorldBean helloWorldBean2(@PathVariable String id){

        return  new HelloWorldBean(id);
    }


}

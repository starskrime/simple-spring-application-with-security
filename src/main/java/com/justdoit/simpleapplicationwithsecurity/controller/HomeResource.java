package com.justdoit.simpleapplicationwithsecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String helloWorld(){
        return ("<h1>Hello World</h1>");
    }

    @GetMapping("/user")
    public String helloWUser(){
        return ("<h1>Hello User</h1>");
    }

    @GetMapping("/admin")
    public String helloAdmin(){
        return ("<h1>Hello Admin</h1>");
    }

}

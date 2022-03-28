package com.justdoit.simpleapplicationwithsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeResource {

    @GetMapping("/")
    public String helloWorld(){
        return ("<h1>Hello World</h1>");
    }


}

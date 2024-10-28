package com.example.accounts.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

    @GetMapping("sayHello")
    public String GetHello(){
        return "Hello World";
    }
}

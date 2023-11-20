package com.graysan.security.basicauth.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/private")
public class PrivateController {

    @GetMapping
    public String helloWorldPrivate(){
        return "Hello World from private endpoint!";
    }

    //@PreAuthorize("hasRole('USER')") // annotation yerine SecurityConfigden authorizeHttpRequest - requestMatchers - hasRole
    @GetMapping("/user")
    public String helloWorldUserPrivate(){
        return "Hello World from user private endpoint!";
    }

    //@PreAuthorize("hasRole('ADMIN')") // annotation yerine SecurityConfigden authorizeHttpRequest - requestMatchers - hasRole
    @GetMapping("/admin")
    public String helloWorldAdminPrivate(){
        return "Hello World from admin private endpoint!";
    }
}

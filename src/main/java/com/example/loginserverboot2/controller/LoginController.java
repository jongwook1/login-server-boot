package com.example.loginserverboot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class LoginController {

    @GetMapping("/loginAction")
    public String joinAction( @RequestParam("userid") String userId, @RequestParam("pw") String pw){


        System.out.println(userId);
        System.out.println(pw);

        return "main";
    }



}

package com.example.loginserverboot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class JoinController {

    @GetMapping("/joinAction")
    public String joinAction(@RequestParam("name") String name, @RequestParam("userid") String userId, @RequestParam("pw") String pw){

        //Service
        // 데이터 변경 관리


        //dao 호출 -> DB
        System.out.println(name);
        System.out.println(userId);
        System.out.println(pw);

        return "index";
    }


}

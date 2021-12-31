package com.example.loginserverboot2.controller;

import com.example.loginserverboot2.domain.User;
import com.example.loginserverboot2.domain.UserRepository;
import com.example.loginserverboot2.domain.UserRequestDto;
import com.example.loginserverboot2.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService service;

    //api 구현


    // CRUD
    // 1. Create
    @PostMapping("/v1/users")
    public User addUser(@RequestBody UserRequestDto userRequestDto){
        return service.addUser(userRequestDto);
    }

    // 2. Read
    @GetMapping("/v1/users/{code}")
    public User getUser(@PathVariable int code){
        return service.getUser(code);
//        User user = null;
//        //user = new User(new UserRequestDto("apple",  "1234",  "김사과"));
//
//        user = repo.findById(code).orElseThrow(
//                // 람다식
//                () -> new IllegalArgumentException("존재하지 않는 사용자입니다.")
//        );
//        return user;
    }

     //getUsers 메소드 완성 -> 디엠으로 제출 (브라우저 또는 API플랫폼에서 get 요청 결과물 캡쳐)
    @GetMapping("/v1/users")
    public List<User> getUsers(){
        return service.getUsers();
//        List<User> users = null;
//        users = repo.findAll();
//       return  users;
    }

    // 3. Update
    @PutMapping("/v1/users/{code}")
    public User updateUser(@PathVariable int code, @RequestBody UserRequestDto userRequestDto ){
        return service.updateUser(code, userRequestDto);
    }



    // 4. Delete
    @DeleteMapping("/v1/users/{code}")
    public int deleteUser(@PathVariable int code){
        return service.deletUser(code);
    }
}

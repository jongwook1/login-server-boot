package com.example.loginserverboot2.service;


import com.example.loginserverboot2.domain.User;
import com.example.loginserverboot2.domain.UserRepository;
import com.example.loginserverboot2.domain.UserRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository repo;

    //Service 클래스는 비지니스로직을 담음

    //CRUD
    //1. Create
    public User addUser(UserRequestDto userRequestDto){
        User user = new User(userRequestDto);
        return repo.save(user);
    }


    //2. Read
    public User getUser(int code){
        User user = null;
        //user = new User(new UserRequestDto("apple",  "1234",  "김사과"));

        user = repo.findById(code).orElseThrow(
                // 람다식
                () -> new IllegalArgumentException("존재하지 않는 사용자입니다.")
        );
        return user;
    }
    public List<User> getUsers(){
        List<User> users = null;
        users = repo.findAll();
        return  users;
    }

    // 3. Update
    @Transactional  //기존의 테이블에 쿼리가 일어나야함을 알려줌
    public User updateUser(int code,UserRequestDto userRequestDto){
//        User user = repo.findById(code).orElse(
//                () -> new IllegalArgumentException("존재하지 않는 사용자입니다.")
//        );
        User user = getUser(code);
        user.update(userRequestDto);
        return user;
    }

    //4. Delete
    @Transactional
    public int deletUser(int code){
        User  user = getUser(code);
        repo.deleteById(user.getCode());
        return user.getCode();
    }

}

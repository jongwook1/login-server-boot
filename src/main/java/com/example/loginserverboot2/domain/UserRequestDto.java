package com.example.loginserverboot2.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor  // for JPA Repo
@Getter
public class UserRequestDto {
    private int code;
    private String id, pw, firstname;

    // 필요한 생성자 오버로딩
    public UserRequestDto(String id, String pw){
        this.id = id;
        this.pw = pw;
    }

    public UserRequestDto(String id, String pw, String firstname){
        this.id = id;
        this.pw = pw;
        this.firstname = firstname;
    }
}

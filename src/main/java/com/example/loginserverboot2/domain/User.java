package com.example.loginserverboot2.domain;

import com.example.loginserverboot2.util.Timestamped;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// Domain : table -> @Entity
// ㄴ 모든 멤버가 -> 컬럼

@NoArgsConstructor // 기본생성자를 자동으로 만들어줌
@Getter
@Table(name="users")
@Entity // 이 클래스가 연동된 데이터베이스의 테이블에 해당함을 알려줌(테이블 맵핑 대상으로 지정)
public class User extends Timestamped {
    @Id // pk를 알려줌
    private int code;

    @NonNull
    @Column
    private String id, pw;

    @Column
    private String firstname;

    // UserRequestDto를 활용한 생성자 만들기

    public User(UserRequestDto UserRequestDto){
        this.id = UserRequestDto.getId();
        this.pw = UserRequestDto.getPw();
        this.firstname = UserRequestDto.getFirstname();
    }



//    public User(){}

//    public User(String id, String pw){
//        this.id = id;
//        this.pw = pw;
//    }
//
//    public User(String id, String pw, String firstname){
//        this.id = id;
//        this.pw = pw;
//        this.firstname = firstname;
//    }








//    public int getCode() {
//        return code;
//    }
//
//    public String getId() {
//        return id;
//    }
//
//    public String getPw() {
//        return pw;
//    }
//
//    public String getFirstname() { return firstname;  }

//    public void setPw(String pw){ this.pw = pw; }
//
//    public void setName(String firstname){ this.firstname = firstname; }

    // setter 메소드 대신 -> update(UserRequestDto를 받는) 메소드를 통해 처리
    public void update(UserRequestDto userRequestDto){
        this.pw = userRequestDto.getPw();
        this.firstname = userRequestDto.getFirstname();
    }
}

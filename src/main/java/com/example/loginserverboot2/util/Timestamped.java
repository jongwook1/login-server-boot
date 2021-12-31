package com.example.loginserverboot2.util;

import lombok.Getter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@MappedSuperclass // 나(부모)를 상속받은 자식 클래스가 자동으로 컬럼(멤버) 부여받을 수 있게 설정
@EntityListeners(AuditingEntityListener.class)
public class Timestamped {
    // data.annotation으로 각 컬럼(멤버)가 어떤 내용인지 구체적으로 명시
    @CreatedDate
    private LocalDateTime createdAt;
    @LastModifiedDate
    private LocalDateTime modifiedAt;
}

package com.example.springreactivejava.domain.member;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Member {
    @Id
    Integer id;
    String email;
    String password;
    String nickname;

    public Member(Integer id, String email, String password, String nickname) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.nickname = nickname;
    }
}

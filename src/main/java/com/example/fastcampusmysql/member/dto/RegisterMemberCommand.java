package com.example.fastcampusmysql.member.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
public final class RegisterMemberCommand {

    final private String email;
    final private String nickname;
    final private LocalDate birthday;

    public RegisterMemberCommand(String email, String nickname, LocalDate birthday) {
        this.email = email;
        this.nickname = nickname;
        this.birthday = birthday;
    }
}

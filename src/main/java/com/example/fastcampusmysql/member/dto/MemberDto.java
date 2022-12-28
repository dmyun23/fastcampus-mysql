package com.example.fastcampusmysql.member.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
public class MemberDto {
    final private Long id;
    final private String email;
    final private String nickname;
    final private LocalDate birthday;
}

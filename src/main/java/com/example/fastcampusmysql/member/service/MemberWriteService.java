package com.example.fastcampusmysql.member.service;

import com.example.fastcampusmysql.member.dto.MemberDto;
import com.example.fastcampusmysql.member.dto.RegisterMemberCommand;
import com.example.fastcampusmysql.member.entity.Member;
import com.example.fastcampusmysql.member.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MemberWriteService {

    final private MemberRepository memberRepository;
    public Member register(RegisterMemberCommand command){
        /*
            목표 - 회원정보(이메일,닉네임,생년월일)를 등록한다.
                - 닉네임은 10글자를 넘길 수 없다.
            파라미터 - memberRegisterCommand

            val member = Member.of(memberRegisterCommand)
            memberRepository.save(member)
         */
        var member = Member.builder()
                .nickname(command.getNickname())
                .email(command.getEmail())
                .birthday(command.getBirthday())
                .build();

        return memberRepository.save(member);
    }

    public MemberDto toDto(Member member) {
        return new MemberDto(member.getId(), member.getEmail(), member.getNickname(),member.getBirthday());
    }
}

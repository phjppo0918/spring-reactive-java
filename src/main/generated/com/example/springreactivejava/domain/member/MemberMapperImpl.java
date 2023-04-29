package com.example.springreactivejava.domain.member;

import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-04-28T20:01:15+0900",
    comments = "version: 1.5.1.Final, compiler: javac, environment: Java 17.0.5 (Homebrew)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public Member toEntity(MemberRequest dto) {
        if ( dto == null ) {
            return null;
        }

        Long id = null;
        String email = null;
        String password = null;
        String nickname = null;

        Member member = new Member( id, email, password, nickname );

        return member;
    }

    @Override
    public MemberResponse toResponse(Member member) {
        if ( member == null ) {
            return null;
        }

        MemberResponse.MemberResponseBuilder memberResponse = MemberResponse.builder();

        return memberResponse.build();
    }
}

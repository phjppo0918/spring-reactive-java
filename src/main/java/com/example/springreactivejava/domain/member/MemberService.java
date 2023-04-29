package com.example.springreactivejava.domain.member;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class MemberService {
    MemberRepository memberRepository;
    MemberMapper memberMapper;
    public Mono<MemberResponse> create(MemberRequest dto) {
        Mono<Member> savedMember = memberRepository.save(new Member( 1,"aa", "asdf", "adsf"));
        return savedMember.map(memberMapper::toResponse);
    }

    public Flux<MemberResponse> findAllByNickname(String nickname) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    public Mono<MemberResponse> findById(Long id) {
        throw new UnsupportedOperationException("Not supported yet");
    }

    public Flux<MemberResponse> findAll() {
        throw new UnsupportedOperationException("Not supported yet");
    }
}

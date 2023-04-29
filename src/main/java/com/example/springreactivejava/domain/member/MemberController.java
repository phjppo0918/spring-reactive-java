package com.example.springreactivejava.domain.member;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequiredArgsConstructor
@RequestMapping("members")
public class MemberController {
    private final MemberService memberService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Mono<MemberResponse> signup(@RequestBody @Validated MemberRequest dto) {
        return memberService.create(dto);
    }

    @GetMapping
    public Flux<MemberResponse> getAll() {
        return memberService.findAll();
    }

    @GetMapping("{id}")
    public Mono<MemberResponse> getMember(@PathVariable Long id) {
        return memberService.findById(id);
    }

    @GetMapping(params = "nickname")
    public Flux<MemberResponse> getMembersByNickname(@RequestParam String nickname) {
        return memberService.findAllByNickname(nickname);
    }

}

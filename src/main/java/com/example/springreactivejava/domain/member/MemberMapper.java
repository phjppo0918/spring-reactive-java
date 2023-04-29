package com.example.springreactivejava.domain.member;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface MemberMapper {
    Member toEntity(MemberRequest dto);
    MemberResponse toResponse(Member member);
}

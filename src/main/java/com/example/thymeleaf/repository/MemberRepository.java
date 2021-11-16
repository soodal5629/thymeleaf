package com.example.thymeleaf.repository;

import com.example.thymeleaf.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository { //저장소 역할
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}

package com.kjh.hellospring.repository;

import com.kjh.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberResitory {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}

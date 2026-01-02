package com.example.practicejpa1.repository;

import com.example.practicejpa1.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {
}

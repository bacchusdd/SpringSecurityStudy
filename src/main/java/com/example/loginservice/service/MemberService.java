package com.example.loginservice.service;


import com.example.loginservice.domain.member.Member;
import com.example.loginservice.domain.member.MemberRepository;
import com.example.loginservice.dto.MemberForm;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class MemberService {

    private final MemberRepository memberRepository;

    // 회원 저장
    @Transactional
    public Long createMember(MemberForm form){
        Member member = form.toEntity();
        memberRepository.save(member);

        return member.getUserId();
    }

}

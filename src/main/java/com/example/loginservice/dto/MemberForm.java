package com.example.loginservice.dto;

import com.example.loginservice.domain.member.Member;
import lombok.NoArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@NoArgsConstructor
public class MemberForm {

    private Long userId;
    private String userName;
    private String password;

    public Member toEntity(){
        return Member.builder()
                .userId(userId)
                .userName(userName)
                /* 암호화 */
                .password(new BCryptPasswordEncoder().encode(password))
                .build();
    }

}

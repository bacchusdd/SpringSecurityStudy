package com.example.loginservice.domain.member;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Table(name="member")
public class Member {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    /**
    * security template과 연동 시 기본으로 제공하는 name값이 username으로 맞춰쓴다.
     **/
    @Column(name = "name", length = 30)
    private String userName;

    @Column(name = "password")
    private String password;


    @Builder
    public Member(Long userId, String userName, String password){
        this.userId = userId;
        this.userName = userName;
        this.password = password;
    }
}

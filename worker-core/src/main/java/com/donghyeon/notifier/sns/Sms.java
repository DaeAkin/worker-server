package com.donghyeon.notifier.sns;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Sms {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String phoneNumber;

    private LocalDateTime endAuthTime;

    private String authNumber;

    private boolean authenticated;

    // TODO : 인증번호 생성하는 함수
    public String generateAuthNumber() {
        return RandomStringUtils.randomNumeric(6);
    }

    // TODO : 인증번호 유효시간 설정해주는 함수
    public void setEndAuthTime() {
        this.endAuthTime = LocalDateTime.now().plusMinutes(3);
    }



}

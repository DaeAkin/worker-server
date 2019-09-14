package com.donghyeon.oauth;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@Data
public class OauthAccessToken {
    private String tokenId;				//토큰 id
    @Column(columnDefinition = "mediumblob")
    private Byte[] token;					//토큰 정보
    @Id
    private String authenticationId;		//인증 id
    private String userName;				//유저 이름
    private String clientId;				//클라이언트 이름
    @Column(columnDefinition = "mediumblob")
    private Byte[] authentication;		//인증 정보
    private String refreshToken;			//리프레쉬 토큰
}

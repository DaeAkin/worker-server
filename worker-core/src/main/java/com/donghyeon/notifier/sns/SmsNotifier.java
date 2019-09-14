package com.donghyeon.notifier.sns;

import com.donghyeon.notifier.Notifier;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

@Component
@Slf4j
public class SmsNotifier implements Notifier.SmsNotifier {
    // 이것도 알리고 안쓰면 유연하지 못하게 대처가 되는데,, 인터페이스로 묶일 수 있으려나?..
//    @Autowired
//    AligoProperty aligoProperty;

    @Autowired
    RestTemplate restTemplate;

    private final String SEND_URL = "https://apis.aligo.in/send/";

    @Override
    public void sendAuthNumber(String phoneNumber,String authNumber) {
        MultiValueMap<String,String> smsApiRequestMap = new LinkedMultiValueMap<>();

        String msg = "인증번호는 [ "+authNumber+"] 입니다.";

        smsApiRequestMap.add("key","fw2gicijcwg7p7j9noa40qjtiyea5nop");
        smsApiRequestMap.add("user_id","kei890");
        smsApiRequestMap.add("sender","01029904450");
        smsApiRequestMap.add("receiver",phoneNumber);
        smsApiRequestMap.add("msg",msg);

        smsApiRequestMap.add("testmode_yn","Y"); // 테스트 모드시

        //외부 API 요청
        log.info("메세지 전송 시작...");
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        HttpEntity<MultiValueMap> requestEntity =  new HttpEntity<>( smsApiRequestMap, headers);
        ResponseEntity<SmsApiResponse> smsApiResponse = restTemplate.postForEntity(SEND_URL, requestEntity, SmsApiResponse.class);
        log.info("snsResponse {} ",smsApiResponse.getBody().toString());





    }
}

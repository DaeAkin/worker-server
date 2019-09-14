package com.donghyeon.notifier.sns;

import lombok.Data;


@Data
public class SmsApiResponse {

    private Integer result_code;    //결과코드(API 수신유무)
    private String message; //	결과 메세지( result_code 가 0 보다 작은경우 실패사유 표기)
    private Integer msg_id; //	메세지 고유 ID
    private Integer success_cnt; //	요청성공 건수
    private Integer error_cnt; //	요청실패 건수
    private String msg_typeprivate;// 	메시지 타입 (1. SMS, 2.LMS, 3. MMS)
}

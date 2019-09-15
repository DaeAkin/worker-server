package com.donghyeon.geo.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class KakaoGeoApi extends GeoService {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    WebClient.Builder webClientBuilder;

    private final String KAKAO_REST_KEY ="KakaoAK 65f9cd448f85f73f1e20f99636e77420";

    @Override
    public List<String> getNearby(String x, String y) {
        String url = "https://dapi.kakao.com/v2/local/geo/coord2regioncode.json?x="+x+"&y="+y;
        log.info("KAKAO 로컬 API 호출 시작..");
        Mono<String> mono =  webClientBuilder.build()
                .get()
                .uri(url)
                .header("Authorization",KAKAO_REST_KEY)
                .retrieve()
                .bodyToMono(String.class);

//        ResponseEntity<KakaoLocalApiResponse> kakaoLocalApiResponse = restTemplate.getForEntity(url, KakaoLocalApiResponse.class,kakaoLocalApiRequestMap);

        log.info(mono.toString());


        return null;
    }
}

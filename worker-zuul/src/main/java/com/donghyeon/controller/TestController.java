package com.donghyeon.controller;

import com.donghyeon.dto.TestDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public TestDto testGetMethod(@RequestBody TestDto testDto) {
        return new TestDto("This is Test GetMapping" ,true);
    }
}

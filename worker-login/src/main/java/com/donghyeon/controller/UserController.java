package com.donghyeon.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    Environment environment;

    @RequestMapping("/test")
    public String test() {
        String serverPort = environment.getProperty("local.server.port");

        System.out.println("Port :" + serverPort);

        return "Hello from Backend! Host : localhst :: port : " + serverPort;

    }

}

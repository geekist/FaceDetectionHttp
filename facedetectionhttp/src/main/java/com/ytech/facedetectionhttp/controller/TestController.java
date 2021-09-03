package com.ytech.facedetectionhttp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController {

    @RequestMapping("/world")
    String hello() {
        return "Hello world,I am home";
    }
}





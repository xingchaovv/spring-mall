package com.xingchaovv.spring.mall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class EchoController {

    @GetMapping("echo")
    public String echo() {
        return String.format("echo(%s)", new Date());
    }
}

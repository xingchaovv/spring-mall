package com.xingchaovv.spring.mall.goods.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HomeController {

    @GetMapping("/")
    public String home() {
        return String.format("home(%s)", new Date());
    }
}

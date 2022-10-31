package com.xingchaovv.spring.mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("orders")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("order")
    public String getOrder(@RequestParam Integer orderId) {
        String goodsDesc = restTemplate.getForObject("http://goods-api/goods/goods?goodsId=1", String.class);
        return "goodsDesc: " + goodsDesc;
    }
}

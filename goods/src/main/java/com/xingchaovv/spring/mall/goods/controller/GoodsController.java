package com.xingchaovv.spring.mall.goods.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("goods")
public class GoodsController {

    @GetMapping("goods")
    public String getOrder(@RequestParam Integer goodsId) {
        return String.format("goods(Best Book)(%s)", new Date());
    }
}

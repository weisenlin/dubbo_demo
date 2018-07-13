package com.wsl.dubbo.consumer.controller;

import com.wsl.dubbo.consumer.service.ConsumerService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * create by WSL_SILVA
 * 日期: 2018/7/12 0012
 * 用途：
 * 描述:
 */
@RestController
public class TestController {

    @Resource
    private ConsumerService consumerService;

    @RequestMapping("test")
    public String test(){
        consumerService.test();
        return "helloworld";
    }
}

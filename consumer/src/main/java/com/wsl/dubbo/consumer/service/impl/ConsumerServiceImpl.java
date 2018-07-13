package com.wsl.dubbo.consumer.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.wsl.demo.service.TestService;
import com.wsl.dubbo.consumer.service.ConsumerService;
import org.springframework.stereotype.Component;

/**
 * create by WSL_SILVA
 * 日期: 2018/7/12 0012
 * 用途：
 * 描述:
 */
@Component
public class ConsumerServiceImpl implements ConsumerService {

    @Reference(url = "dubbo://127.0.0.1:20880")
    private TestService testService;

    @Override
    public void test() {
        testService.test();
    }
}

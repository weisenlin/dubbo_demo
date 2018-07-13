package com.wsl.dubbo.producer.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.wsl.demo.service.TestService;
import org.springframework.stereotype.Component;

/**
 * create by WSL_SILVA
 * 日期: 2018/7/12 0012
 * 用途：
 * 描述:
 */
@Service(interfaceClass = TestService.class)
@Component
public class TestServiceImpl implements TestService {
    @Override
    public void test() {
        System.out.println("==============远程调用服务===============");
    }
}

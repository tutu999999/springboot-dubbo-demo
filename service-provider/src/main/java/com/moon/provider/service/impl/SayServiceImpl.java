package com.moon.provider.service.impl;


import com.moon.demo.serivce.SayService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class SayServiceImpl implements SayService {

    @Override
    public String sayHelloByName(String name) {
        return name + ",hello!";
    }
}

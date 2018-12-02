package com.example.demo.service.impl;

import com.example.demo.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service("testService")
public class TestServiceImpl implements TestService {

    @Override
    public String test() {
        return "yes dubbo is success";
    }
}

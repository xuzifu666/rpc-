package com.example.demo.controller;

import com.example.demo.service.TestService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
public class DemoController {

    @Autowired
    private TestService testService;

    @RequestMapping("test")
    public String test(){
        return "success";
    }

}

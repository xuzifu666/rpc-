package com.example.demo.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TestAop {

    @Pointcut("execution(public * com.example.demo.service..*(..))")
    public void webLog(){}

    @Before("webLog()")
    public void beforeTest(JoinPoint joinPoint){
        System.out.println("begin");
    }
}

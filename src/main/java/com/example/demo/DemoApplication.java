package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@EnableAspectJAutoProxy
@ImportResource(locations = {"classpath:provider.xml"})
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);

        synchronized (DemoApplication.class){
            try {
                DemoApplication.class.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

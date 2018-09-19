package com.example.biz.service;

import org.springframework.stereotype.Component;

@Component
public class SchedualServiceHelloHystric implements ScheduleServiceHello {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}

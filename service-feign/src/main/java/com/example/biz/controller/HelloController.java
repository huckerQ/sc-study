package com.example.biz.controller;

import com.example.biz.service.ScheduleServiceHello;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    ScheduleServiceHello  scheduleServiceHello;

    @GetMapping(value = "/hello")
    public  String hi(@RequestParam String name) {
        return scheduleServiceHello.sayHiFromClientOne( name );
    }
}

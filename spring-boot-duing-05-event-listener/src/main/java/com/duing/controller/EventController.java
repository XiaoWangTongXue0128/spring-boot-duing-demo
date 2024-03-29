package com.duing.controller;

import com.duing.event.CustomEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController//设置返回json
public class EventController {
    //事件发布器
    @Autowired
    private ApplicationEventPublisher publisher;

    @RequestMapping("/event")
    public String event() {
        //事件发布
        publisher.publishEvent(new CustomEvent(this));
        return "success";
    }
}

package com.duing.event;

import org.springframework.context.ApplicationEvent;

/**
 * 创建事件event
 */
public class CustomEvent extends ApplicationEvent {

    public CustomEvent(Object source) {
        super(source);
    }

    public void printMessage(String message) {
        System.out.println("自定义事件，打印信息："+message);
    }
}

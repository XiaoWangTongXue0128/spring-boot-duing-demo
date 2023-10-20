package com.duing.listener;

import com.duing.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

/**
 * 创建事件监听器
 * 方式二：通过注解@Component申明这是一个需要加载的监听类
 */
@Component
public class CustomListener2 implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.printMessage("CustomListener2监听到了");
        
    }
}

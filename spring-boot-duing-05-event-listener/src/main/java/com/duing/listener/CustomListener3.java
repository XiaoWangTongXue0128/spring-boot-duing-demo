package com.duing.listener;

import com.duing.event.CustomEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 创建事件监听器
 * 方式三：自定义类不需要实现接口，通过注解@Component申明这是一个需要加载的类
 * 在方法上标明@EventListener注解,声明这是一个监听组件，监听的事件是方法的参数
 */
@Component
public class CustomListener3 {

    /**
     * @EventListener声明是一个监听组件，监听的事件是方法的组件
     */
    @EventListener
    public void customEvent(CustomEvent event) {
        event.printMessage("CustomListener3监听到了");
    }
}

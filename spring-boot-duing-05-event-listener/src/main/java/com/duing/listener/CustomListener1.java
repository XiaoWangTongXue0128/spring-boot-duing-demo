package com.duing.listener;

import com.duing.event.CustomEvent;
import org.springframework.context.ApplicationListener;

/**
 * 创建事件监听器
 * 方式一：主函数加载
 */
public class CustomListener1 implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.printMessage("CustomListener1监听到了");

    }
}

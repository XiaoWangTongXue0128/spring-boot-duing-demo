package com.duing.listener;

import com.duing.event.CustomEvent;
import org.springframework.context.ApplicationListener;

/**
 * 创建事件监听器
 * 方式四：
 * 通过yml配置文件配置加载监听器4
 */
public class CustomListener4 implements ApplicationListener<CustomEvent> {

    @Override
    public void onApplicationEvent(CustomEvent customEvent) {
        customEvent.printMessage("CustomListener4监听到了");

    }
}

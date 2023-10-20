package com.duing.config;

import org.springframework.boot.web.context.WebServerInitializedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * 通过监听WebServerInitializedEvent获取创建的容器（无限制，都可使用）：
 * 当前WebServer实现类为：org.springframework.boot.web.embedded.undertow.UndertowWebServer
 * 在容器启动之前创建
 */
@Component
public class ListenerConfig {
    @EventListener(WebServerInitializedEvent.class)
    public void onWebServerReady(WebServerInitializedEvent event) {
        System.out.println("ListenerConfig--当前WebServer实现类为："+event.getWebServer().getClass().getName());
    }

}

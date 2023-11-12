package com.duing.config;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.web.context.WebServerApplicationContext;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WebConfig {
    //优先级比application.properties文件中的配置更高
    @Bean
    WebServerFactoryCustomizer<ConfigurableWebServerFactory> customizer() {
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
            @Override
            public void customize(ConfigurableWebServerFactory factory) {

                factory.setPort(5110);
            }
        };
    }

    /**
     * 查看创建的容器（必须是web应用才可使用）：
     *（响应式）当前web容器的实现类是org.springframework.boot.web.embedded.undertow.UndertowWebServer
     * 在容器启动之后打印
     */
    @Bean
    public ApplicationRunner runner(WebServerApplicationContext context) {
        return args -> {
            System.out.println("WebConfig--当前web容器的实现类是"
                    +context.getWebServer().getClass().getName());
        };
    }
}

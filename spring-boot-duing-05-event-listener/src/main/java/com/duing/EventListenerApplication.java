package com.duing;

import com.duing.listener.CustomListener1;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class EventListenerApplication {

    public static void main(String[] args) {
        //获取去事件注册表ApplicationContext的子类
        ConfigurableApplicationContext context = SpringApplication.run(EventListenerApplication.class, args);
        //加载自定义监听器
        context.addApplicationListener(new CustomListener1());

    }

}

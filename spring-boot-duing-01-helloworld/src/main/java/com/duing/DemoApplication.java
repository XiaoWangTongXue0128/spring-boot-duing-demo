package com.duing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication
 * 声明springboot的入口类
 */
@SpringBootApplication
public class DemoApplication {
    public static void main(String[] args) {
//        使用SpringApplication的静态方法启动springboot程序
        SpringApplication.run(DemoApplication.class, args);
    }
}

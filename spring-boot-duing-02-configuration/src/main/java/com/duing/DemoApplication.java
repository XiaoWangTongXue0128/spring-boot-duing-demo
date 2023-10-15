package com.duing;

import com.duing.bean.Food;
import com.duing.config.FoodConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * @SpringBootApplication
 * 声明springboot的入口类
 * @EnableConfigurationProperties
 * 告诉主程序自动引入配置文件，且配置文件对应的类作为它的参数
 */
@SpringBootApplication
@EnableConfigurationProperties(FoodConfig.class)
public class DemoApplication {
    public static void main(String[] args) {
        //        使用SpringApplication的静态方法启动springboot程序
        SpringApplication.run(DemoApplication.class, args);
    }
}

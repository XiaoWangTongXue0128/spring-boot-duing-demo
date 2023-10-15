package com.duing.config;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @ConfigurationProperties
 * 声明这是一个配置文件对应的类
 * prefix前缀只想配置文件中的一级目录
 */
//@Getter
//@Setter
@Data
@ConfigurationProperties(prefix = "food")
public class FoodConfig {

    private String testA;

    private String testB;
    private String[] testC;



}

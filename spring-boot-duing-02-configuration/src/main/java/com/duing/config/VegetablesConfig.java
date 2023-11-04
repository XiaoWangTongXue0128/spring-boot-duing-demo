package com.duing.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * vegetables.potato=土豆
 * vegetables.eggplant茄子
 * vegetables.greenpeper=青椒
 */
@Data
@Configuration
@ConfigurationProperties(prefix = "vegetables")
@PropertySource("classpath:vegetables.properties")
public class VegetablesConfig {
    private String potato;
    private String eggplant;
    private String greenpeper;


}

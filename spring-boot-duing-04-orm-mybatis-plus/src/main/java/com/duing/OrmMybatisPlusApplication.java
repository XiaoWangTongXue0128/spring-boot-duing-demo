package com.duing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@MapperScan("com.duing.mapper")
@SpringBootApplication
public class OrmMybatisPlusApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrmMybatisPlusApplication.class, args);
    }

}

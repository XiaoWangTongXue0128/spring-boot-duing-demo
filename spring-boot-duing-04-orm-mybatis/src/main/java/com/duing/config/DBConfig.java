package com.duing.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class DBConfig {
    @Bean("db1")
    @ConfigurationProperties("spring.datasource.db1")
    public DataSource dataSource1() {
        return DataSourceBuilder.create().build();
    }

    @Bean("db2")
    @ConfigurationProperties("spring.datasource.db2")
    public DataSource dataSource2() {
        return DataSourceBuilder.create().build();
    }
}

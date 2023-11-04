package com.duing;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan(basePackages = "com.duing.model")
@SpringBootApplication
public class H2DataBaseApplication {

    public static void main(String[] args) {
        SpringApplication.run(H2DataBaseApplication.class, args);
    }

}

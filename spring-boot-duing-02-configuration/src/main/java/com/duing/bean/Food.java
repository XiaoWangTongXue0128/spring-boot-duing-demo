package com.duing.bean;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.io.Serializable;

//@Getter
//@Setter
@Data
public class Food implements Serializable {
    private String testA;
    private String testB;
    private String[] testC;


}

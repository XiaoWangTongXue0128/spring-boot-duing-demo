package com.duing.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @EnableSwagger2
 * 开启Swagger功能
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /**
     * 使用Swagger需要创建一个摘要Docket
     * 文档类型：SWAGGER_2
     * 文档通过一系列选择器组成 api+path
     * select()设置api()和path()
     * apis:选择为哪些controller生成接口
     * （RequestHandlerSelectors.any()指全部的controller都生成对应接口,RequestHandlerSelectors.basePackage()可以指定控制类的包）
     * path：对查找出来的接口进行筛选（PathSelectors.any()指将查找出来的全部接口都获取出来）
     * build（）：创建对应的swagger文档
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2).select().
                apis(RequestHandlerSelectors.basePackage("com.duing.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(apiInfo());
    }

    /**
     * 自定义文档设置
     * 通过ApiInfoBuilder创建ApiInfo
     * title标题
     * description描述
     * version版本
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("spring-boot-duing-06-swagger")
                .description("这是一个简单地swagger demo")
                .version("1.0")
                .build();
    }
}

package com.duing.config;

import com.duing.interceptor.CustomInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
    @Autowired
    public CustomInterceptor customInterceptor;

    /**
     *注册自定义拦截器，并定义拦截规则
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //全部拦截
        registry.addInterceptor(customInterceptor).addPathPatterns("/**");

    }
}

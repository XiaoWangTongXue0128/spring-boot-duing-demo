package com.duing.config;

import com.duing.filter.CustomFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean<CustomFilter> filterRegistrationBean() {
        FilterRegistrationBean<CustomFilter> filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new CustomFilter());
        filterRegistrationBean.addUrlPatterns("/*");
//        filterRegistrationBean.setOrder(1);//设置多个filter时该filter启动优先级，值越小，优先级越高
        return filterRegistrationBean;
    }
}

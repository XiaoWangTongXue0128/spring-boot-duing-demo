package com.duing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    /**
     * @RequestMapping
     * 请求与控制方法之间的对应关系
     * @ResponseBody设置响应值为JSON格式而非默认的jsp或html形式的视图
     */
    @RequestMapping("hello")
    @ResponseBody
    public String hello() {
        return "hello MQ world";
    }
}

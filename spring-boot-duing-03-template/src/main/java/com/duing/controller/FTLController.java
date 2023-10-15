package com.duing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @Controller是返回视图层使用的注解
 * @RestController是返回JSON数据时使用的注解
 */
@Controller
public class FTLController {
    @RequestMapping("ftl")
    public String index(ModelMap modelMap) {
        modelMap.addAttribute("now", new Date().toString());
        return "/freemarker/index";
    }
}

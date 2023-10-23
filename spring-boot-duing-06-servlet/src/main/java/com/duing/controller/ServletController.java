package com.duing.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ServletController {
    @RequestMapping("servlet")
    public String servlet() {
        System.out.println("ServletController servlet...");
        return "hello servlet";
    }
}

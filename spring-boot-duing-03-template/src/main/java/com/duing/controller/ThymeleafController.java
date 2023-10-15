package com.duing.controller;

import com.duing.bean.Person;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@PropertySource(value = "classpath:message.properties",encoding = "UTF-8")
public class ThymeleafController {
    @Value("${something}")
    private String message;

    @RequestMapping("thymeleaf")
    public String index(Model model) {
        Person person = new Person();
        person.setName("王天赐");
        person.setAge(18);
        model.addAttribute("name", "<h1>thymeleaf</h1>");
        model.addAttribute("person", person);
        System.out.println(message);
        return "/thymeleaf/index";
    }

    @RequestMapping("/welcomerequest")
    public String welcome() {
        return "/thymeleaf/welcome";
    }
}

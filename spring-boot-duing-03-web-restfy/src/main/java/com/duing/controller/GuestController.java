package com.duing.controller;

import com.duing.bean.Guest;
import com.duing.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * @RequestMapping("/guest")
 * 放在类上面表示类里面的方法都是以"/guest"开头的
 */
@Controller
@RequestMapping("/guest")
public class GuestController {
    @Autowired
    private GuestService guestService;

//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping//等效于@RequestMapping(method = RequestMethod.GET)
    public String list(Model model) {
        List<Guest> guestList = guestService.list();
        model.addAttribute("guestList", guestList);
        return "list";
    }

    @GetMapping("/toAdd")
    public String toAdd() {
        return "add";
    }

    @PostMapping
    public String add(Guest guest) {
        guestService.add(guest);
        return "redirect:/guest";
    }

    /**
     * 将/guest/toUpdate/{name}格式的url映射到此方法
     * 其中name属性值与注解@PathVariable("name")中的name对应
     * 代表从url路径中获取name的值
     */
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(Model model,@PathVariable("name") String name) {
        Guest guest = guestService.get(name);
        model.addAttribute("guest",guest);
        return "update";
    }

    @PutMapping
    public String update(Guest guest) {
        guestService.update(guest);
        return "redirect:/guest";
    }


    @DeleteMapping("/{name}")
    public String delete(@PathVariable("name") String name) {
        guestService.delete(name);
        return "redirect:/guest";
    }
}

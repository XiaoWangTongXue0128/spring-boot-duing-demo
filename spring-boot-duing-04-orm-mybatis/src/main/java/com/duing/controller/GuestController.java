package com.duing.controller;


import com.duing.model.Guest;
import com.duing.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

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
        List<Guest> guestList = guestService.getGuests();
        model.addAttribute("guestList", guestList);
        return "/list";
    }


}

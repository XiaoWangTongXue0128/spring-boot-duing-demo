package com.duing.controller;


import com.duing.model.Guest;
import com.duing.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @RequestMapping("/guest") 放在类上面表示类里面的方法都是以"/guest"开头的
 */
@RestController
@RequestMapping("/guest")
public class GuestController {

    @Autowired
    private GuestService guestService;


    //等效于@RequestMapping(method = RequestMethod.GET)
    @GetMapping
    public List<Guest> list(Model model) {
        List<Guest> guestList = guestService.getGuests();

        return guestList;
    }

    @GetMapping("/{id}")//等效于@RequestMapping(method = RequestMethod.GET)
    public Guest getGuest(@PathVariable(name = "id") int id) {
        Guest guest = guestService.getGuestById(id);
        return guest;
    }

    @GetMapping("/update")
    public Guest updateGuest(Integer id, String name, String role) {
        Guest guest = new Guest(id, name, role);
        return guestService.updateGuest(guest);
    }

    @GetMapping("/delete/{id}")
    public String deleteGuest(@PathVariable(name = "id") int id) {
        if (id != 0) {
            guestService.deleteGuest(id);
        } else {
            guestService.deleteAllGuest();
        }

        return "success";

    }
}

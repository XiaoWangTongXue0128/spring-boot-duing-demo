package com.duing.dao;

import com.duing.bean.Guest;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class GuestDao {
    static List<Guest> guestList = new ArrayList<>();
    static {
        guestList.add(new Guest("黄晓明", "店长"));
        guestList.add(new Guest("秦海璐", "财务"));
        guestList.add(new Guest("林述巍", "总厨"));
        guestList.add(new Guest("王俊凯", "经理"));
        guestList.add(new Guest("杨紫", "前台"));

    }

    public List<Guest> list() {
        return guestList;
    }
    public void add(Guest guest) {
        guestList.add(guest);
    }

    public Guest get(String nema) {
        for (Guest guest : guestList) {
            if (guest.getName().equals(nema)) {
                return guest;
            }
        }
        return new Guest("","");
    }

    public void update(Guest newGuest) {
        Guest oldGuest = get(newGuest.getName());
        oldGuest.setRole(newGuest.getRole());
    }

    public void delete(String name) {
        Guest guest = get(name);
        guestList.remove(guest);
    }
}

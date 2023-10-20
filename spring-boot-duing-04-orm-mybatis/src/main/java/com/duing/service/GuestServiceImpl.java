package com.duing.service;


import com.duing.mapper.GuestMapper;
import com.duing.mapper2.GuestMapper2;
import com.duing.model.Guest;
import com.duing.tk.mapper.TkGuestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GuestServiceImpl implements GuestService{
    @Autowired
    private GuestMapper2 mapper;
//    @Autowired
//    private TkGuestMapper tkGuestMapper;

    @Override
    public List<Guest> getGuests() {
        return mapper.getGuests();
//        return tkGuestMapper.selectAll();
    }


}

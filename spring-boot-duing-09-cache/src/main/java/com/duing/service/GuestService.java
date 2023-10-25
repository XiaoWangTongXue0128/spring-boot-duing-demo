package com.duing.service;


import com.duing.model.Guest;

import java.util.List;

public interface GuestService {
    List<Guest> getGuests();

    Guest getGuestById(int id);

    /**
     *使用Guest作为返回值时会把方法的返回值放入缓存中
     * 此时的返回值不能是doid或int等
     */
    Guest updateGuest(Guest guest);

    void deleteGuest(int id);

    void deleteAllGuest();

}

package com.duing.mapper2;

import com.duing.model.Guest;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface GuestMapper2 {
    //    参数用#{id}的形势替换
    @Select("select name,role from guest")
    List<Guest> getGuests();
}

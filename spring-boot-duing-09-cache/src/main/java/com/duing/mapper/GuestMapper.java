package com.duing.mapper;

import com.duing.model.Guest;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;


@Mapper
public interface GuestMapper {

//参数用#{id}的形势替换

    @Select("select id,name,role from guest")
    List<Guest> getGuests();

    @Select("select id,name,role from guest where id = #{id}")
    Guest getGuestById(int id);

    @Update("update guest set name = #{name},role = #{role} where id=#{id}")
    int updateGuest(Guest guest);

    @Delete("delete from guest where id=#{id}")
    int deleteGuest(int id);

    @Delete("delete from guest")
    int deleteAllGuest();
}

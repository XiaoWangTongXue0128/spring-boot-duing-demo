package com.duing.mapper;

import com.duing.model.Guest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
//OrmMybatisApplication类上的注解@MapperScan("com.duing.mapper")可让mapper上的注解省略
//@Mapper
public interface GuestMapper {

//    参数用#{id}的形势替换
    @Select("select name,role from guest")
    List<Guest> getGuests();
}

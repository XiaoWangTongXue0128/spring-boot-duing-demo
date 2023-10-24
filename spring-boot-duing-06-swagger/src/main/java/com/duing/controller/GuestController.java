package com.duing.controller;


import com.duing.bean.Guest;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

import java.util.List;

/**
 * @RequestMapping("/guest")
 * 放在类上面表示类里面的方法都是以"/guest"开头的
 * @Api声明一系列接口的功能
 */
@RestController
@RequestMapping("/guest")
@Api(tags = "嘉宾相关的接口(标签)",description = "描述接口")
public class GuestController {

    /**
     * @ApiOperation声明具体接口的功能
     * 放在controller的具体方法上
     */
    @GetMapping//等效于@RequestMapping(method = RequestMethod.GET)
    @ApiOperation("list方法的描述")
    public String list(Model model) {

        return "list";
    }

    @ApiIgnore
    @GetMapping("/toAdd")
    public String toAdd() {
        return "add";
    }

    @PostMapping
    @ApiOperation("add方法的描述")
    public String add(Guest guest) {

        return "add guest";
    }

    /**
     * 将/guest/toUpdate/{name}格式的url映射到此方法
     * 其中name属性值与注解@PathVariable("name")中的name对应
     * 代表从url路径中获取name的值
     */
    @ApiIgnore
    @GetMapping("/toUpdate/{name}")
    public String toUpdate(@PathVariable("name") String name) {

        return "update";
    }

    @PutMapping
    @ApiOperation("update方法的描述")
    public String update(Guest guest) {

        return "update guest";
    }


    @DeleteMapping("/{name}")
    @ApiOperation("delete方法的描述")
    @ApiImplicitParam(name = "name",value = "姓名")
    public String delete(@PathVariable("name") String name) {

        return "delete guest";
    }
}

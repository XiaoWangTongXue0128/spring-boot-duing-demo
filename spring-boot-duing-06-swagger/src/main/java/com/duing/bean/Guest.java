package com.duing.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ApiModel
 * 声明实例
 * @ApiModelProperty
 * 声明实例属性用于api文档中的参数展示
 */
@Data
@AllArgsConstructor
@ApiModel("嘉宾")
public class Guest {
    @ApiModelProperty("嘉宾名字")
    private String name;
    @ApiModelProperty("嘉宾角色")
    private String role;


}

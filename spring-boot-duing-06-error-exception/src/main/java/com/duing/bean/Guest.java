package com.duing.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
public class Guest {
    /**
     * @NotNull——不为空
     * 设置基础类型的属性值不为空，如：int,float,double等
     * @NotBlank——不为空串
     * 广泛用于Sring类型的属性值不为空串
     * @NotEmpty——内容不为空
     * 广泛用于集合类型的属性不为空，如：Map，List等
     */
//    guest.name.notBlank=嘉宾名不能为空 from properties
    @NotBlank(message = "{guest.name.notBlank}")
    private String name;
    @NotBlank
    private String role;
}

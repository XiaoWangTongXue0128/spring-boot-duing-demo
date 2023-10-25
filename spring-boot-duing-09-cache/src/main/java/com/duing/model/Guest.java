package com.duing.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author wang
 * @NoArgsConstructor构建无参构造函数
 */

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Guest implements Serializable {


    private Integer id;

    private String name;

    private String role;


}

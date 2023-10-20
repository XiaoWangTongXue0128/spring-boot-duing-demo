package com.duing.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.io.Serializable;

/**
 * @NoArgsConstructor构建无参构造函数
 */

@NoArgsConstructor
@Data
@AllArgsConstructor
public class Guest implements Serializable {

    private Long id;

    private String name;

    private String role;


}

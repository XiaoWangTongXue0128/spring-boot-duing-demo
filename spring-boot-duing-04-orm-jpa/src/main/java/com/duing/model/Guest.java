package com.duing.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * @Entity 告知Jpa这个类是一个实体类，且该实体类必须存在无参构造函数
 * @NoArgsConstructor构建无参构造函数
 */
@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
public class Guest implements Serializable {
    @Id
    private Long id;
    @Column
    private String name;
    @Column
    private String role;


}

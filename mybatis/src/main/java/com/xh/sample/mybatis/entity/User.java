package com.xh.sample.mybatis.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Create By IntelliJ IDEA
 *
 * @author: XieHua
 * @date: 2021-08-03 17:39
 */
@Setter
@Getter
public class User implements Serializable {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;
}

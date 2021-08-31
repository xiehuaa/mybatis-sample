package com.xh.sample.mybatis.entity;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/**
 * Create By IntelliJ IDEA
 *
 * @author: XieHua
 * @date: 2021-08-30 20:23
 */
@Setter
@Getter
public class Employee {
    private Integer id;
    private String name;
    private List<Integer> role;
}

package com.xh.sample.mybatis.mapper;

import com.xh.sample.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Create By IntelliJ IDEA
 *
 * @author: XieHua
 * @date: 2021-08-02 15:05
 */
public interface UserMapper {
    User getById(@Param("id") Integer id);
}

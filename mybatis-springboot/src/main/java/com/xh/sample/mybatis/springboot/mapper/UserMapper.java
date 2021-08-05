package com.xh.sample.mybatis.springboot.mapper;

import com.xh.sample.mybatis.springboot.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * Create By IntelliJ IDEA
 *
 * @author: XieHua
 * @date: 2021-08-03 17:41
 */
public interface UserMapper {
    int insert(User user);

    User getById(@Param("id") Integer id);
}

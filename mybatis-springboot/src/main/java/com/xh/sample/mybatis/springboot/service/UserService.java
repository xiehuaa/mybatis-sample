package com.xh.sample.mybatis.springboot.service;


import com.xh.sample.mybatis.springboot.entity.User;

/**
 * Create By IntelliJ IDEA
 *
 * @author: XieHua
 * @date: 2021-08-03 17:45
 */
public interface UserService {
    /**
     * 添加用户
     *
     * @param user 用户对象
     * @return 是否成功
     */
    boolean insert(User user);

    /**
     * 通过id获取用户
     *
     * @param id 用户id
     * @return 用户对象
     */
    User getById(Integer id);
}

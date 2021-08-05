package com.xh.sample.mybatis.springboot.service.impl;

import com.xh.sample.mybatis.springboot.entity.User;
import com.xh.sample.mybatis.springboot.mapper.UserMapper;
import com.xh.sample.mybatis.springboot.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Create By IntelliJ IDEA
 *
 * @author: XieHua
 * @date: 2021-08-03 17:45
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;

    public boolean insert(User user) {
        return userMapper.insert(user) > 0;
    }

    public User getById(Integer id) {
        return userMapper.getById(id);
    }
}

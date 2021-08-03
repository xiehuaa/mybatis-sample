package com.xh.sample.mybatis.spring.service.impl;

import com.xh.sample.mybatis.spring.entity.User;
import com.xh.sample.mybatis.spring.mapper.UserMapper;
import com.xh.sample.mybatis.spring.service.UserService;
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
}

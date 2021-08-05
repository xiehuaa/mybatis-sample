package com.xh.sample.mybatis.springboot.service;

import com.alibaba.fastjson.JSON;
import com.xh.sample.mybatis.springboot.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

/**
 * Create By IntelliJ IDEA
 *
 * @author: XieHua
 * @date: 2021-08-05 18:07
 */
@SpringBootTest
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void insertTest() {
        User user = new User();
        user.setAge(17);
        user.setName("SpringBoot");
        user.setGender("男");

        boolean result = userService.insert(user);
        System.out.println("添加用户结果为：" + result);
    }

    @Test
    public void getByIdTest() {
        User user = userService.getById(1);
        System.out.println("获取用户结果为：" + JSON.toJSONString(user));
    }
}

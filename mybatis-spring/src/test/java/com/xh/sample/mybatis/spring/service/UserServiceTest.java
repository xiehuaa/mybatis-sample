package com.xh.sample.mybatis.spring.service;

import com.xh.sample.mybatis.spring.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Create By IntelliJ IDEA
 *
 * @author: XieHua
 * @date: 2021-08-03 17:47
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
public class UserServiceTest {
    @Resource
    private UserService userService;

    @Test
    public void insertTest() {
        User user = new User();
        user.setAge(17);
        user.setName("李四");
        user.setGender("男");

        boolean result = userService.insert(user);
        System.out.println("添加用户结果为：" + result);
    }
}

package com.xh.sample.mybatis;

import com.alibaba.fastjson.JSON;
import com.xh.sample.mybatis.entity.User;
import com.xh.sample.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Create By IntelliJ IDEA
 *
 * @author: XieHua
 * @date: 2021-08-02 15:01
 */
public class TestDemo {
    public static void main(String[] args) throws IOException {
        String resource = "mybatis.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User user = mapper.getById(1);
        System.out.println(JSON.toJSONString(user));
    }
}

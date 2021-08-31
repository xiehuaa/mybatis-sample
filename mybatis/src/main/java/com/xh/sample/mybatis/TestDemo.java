package com.xh.sample.mybatis;

import com.alibaba.fastjson.JSON;
import com.xh.sample.mybatis.entity.Employee;
import com.xh.sample.mybatis.entity.User;
import com.xh.sample.mybatis.mapper.EmployeeMapper;
import com.xh.sample.mybatis.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

/**
 * Create By IntelliJ IDEA
 *
 * @author: XieHua
 * @date: 2021-08-02 15:01
 */
public class TestDemo {
    public static void main(String[] args) throws IOException {
        // 配置文件路径
        String resource = "mybatis.xml";
        // 加载配置文件
        InputStream inputStream = Resources.getResourceAsStream(resource);
        // 创建SqlSessionFactory对象
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        // 获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // insertEmployee(sqlSession);
        getEmployee(sqlSession);
    }

    private static void insertEmployee (SqlSession sqlSession) {
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = new Employee();
        employee.setName("张三");
        employee.setRole(Arrays.asList(1, 2));
        employeeMapper.insert(employee);
        sqlSession.commit();
        sqlSession.close();
    }

    private static void getEmployee(SqlSession sqlSession) {
        EmployeeMapper employeeMapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = employeeMapper.getById(2);
        System.out.println(JSON.toJSONString(employee));

        sqlSession.close();
    }
}

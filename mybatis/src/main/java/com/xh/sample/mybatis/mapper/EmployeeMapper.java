package com.xh.sample.mybatis.mapper;

import com.xh.sample.mybatis.entity.Employee;
import org.apache.ibatis.annotations.Param;

/**
 * Create By IntelliJ IDEA
 *
 * @author: XieHua
 * @date: 2021-08-02 15:05
 */
public interface EmployeeMapper {

    int insert(@Param("employee") Employee employee);

    Employee getById(@Param("id") Integer id);
}

package com.yyh.service;

import com.yyh.po.Dept;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2020-04-22-14:42
 */
public interface DeptService {
    List<Dept> selectAll();


    Dept selectById(int dept_id);


    int insert(Dept dept);

    int delete(int dept_id);

    int update(Dept dept);
}

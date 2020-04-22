package com.yyh.dao;

import com.yyh.po.Dept;

import java.util.List;

/**
 * 功能接口
 * @author YanYuHang
 * @create 2020-04-22-14:18
 */
public interface DeptDao {
    /**
     * 查询全部          不用  mybatis
     *                   JDBC = Java  DataBase  Connection
     * @return
     */
    List<Dept> selectAll();




    Dept selectById(int dept_id);


    int insert(Dept dept);

    int delete(int dept_id);

    int update(Dept dept);






}

package com.yyh.dao.impl;

import com.yyh.dao.DeptDao;
import com.yyh.po.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author YanYuHang
 * @create 2020-04-22-14:22
 */
@Repository
public class DeptDaoImpl implements DeptDao {

   @Autowired
   private JdbcTemplate jdbcTemplate;


    @Override
    public List<Dept> selectAll() {
        //1.创建sql语句
        String sql ="select * from dept";
        //2.对象关系映射 ORM
        RowMapper<Dept> rowMapper = new BeanPropertyRowMapper<Dept>(Dept.class);
        //3.执行查询
        List<Dept> list = jdbcTemplate.query(sql, rowMapper);
        return list;
    }
    @Override
    public Dept selectById(int dept_id) {
        //1.创建sql语句
        String sql ="select * from dept where dept_id=?";
        //2.对象关系映射 ORM
        RowMapper<Dept> rowMapper = new BeanPropertyRowMapper<Dept>(Dept.class);
        //3.执行查询
        Dept dept = jdbcTemplate.queryForObject(sql, rowMapper, dept_id);
        return dept;
    }
         /*
         *   jdbcTemplate   增删改  统一  update
         * */
    @Override
    public int insert(Dept dept) {
        //1.创建sql语句
        String sql ="insert into dept(dept_name) values(?)";
        //2.执行添加操作
        int update = jdbcTemplate.update(sql, dept.getDept_name());
        return update;
    }

    @Override
    public int delete(int dept_id) {
        //1.创建sql语句
        String sql ="delete from dept where dept_id=?";
        //2.执行添加操作
        int update = jdbcTemplate.update(sql, dept_id);
        return update;
    }

    @Override
    public int update(Dept dept) {
        //1.创建sql语句
        String sql ="update dept set dept_name=? where dept_id=?";
        //2.执行添加操作
        int update = jdbcTemplate.update(sql, dept.getDept_name(),dept.getDept_id());
        return update;
    }


}

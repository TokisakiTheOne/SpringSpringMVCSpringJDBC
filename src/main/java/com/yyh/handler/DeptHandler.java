package com.yyh.handler;

import com.sun.org.apache.xpath.internal.operations.Mod;
import com.yyh.po.Dept;
import com.yyh.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author YanYuHang
 * @create 2020-04-22-14:44
 */
@Controller
public class DeptHandler {

    @Autowired
    private DeptService deptService;



    @RequestMapping("/selectAll")
    public String selectAll(Model model){
        model.addAttribute("depts",deptService.selectAll());
        return "selectAll";
    }

    @RequestMapping("/selectById")
    public String selectById(int dept_id, Model model){
        model.addAttribute("dept",deptService.selectById(dept_id));
        return "update";
    }
    @RequestMapping("/toInsert")
    public String toInsert(){
        return "insert";
    }

    @RequestMapping("/delete")
    public String delete(int dept_id){
        deptService.delete(dept_id);
        return "redirect:/selectAll";
    }
    @RequestMapping("/update")
    public String update(Dept dept){
        deptService.update(dept);
        return "redirect:/selectAll";
    }
    @RequestMapping("/insert")
    public String insert(Dept dept){
        deptService.insert(dept);
        return "redirect:/selectAll";
    }







}

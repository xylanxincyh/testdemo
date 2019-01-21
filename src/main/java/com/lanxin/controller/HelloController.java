package com.lanxin.controller;

import com.lanxin.bean.Emp;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cyh on 2018/4/24.
 */
@RestController
public class HelloController {

    @RequestMapping(value = "hello")
    //@ResponseBody
    public String hello(){
        return "hello";
    }

    @RequestMapping(value = "empinfo")
    public Emp empinfo(){
       // System.out.println(1/0);
        Emp emp = new Emp();
        emp.setOid(3);
        emp.setEname("admin");
        return emp;
    }
}

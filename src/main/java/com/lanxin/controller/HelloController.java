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
    public String hello(){
        return "helloddddddddddddd";
    }

    @RequestMapping(value = "empinfo")
    public Emp empinfo(){
        Emp emp = new Emp();
        emp.setOid(3);
        emp.setEname("admin");
        return emp;
    }
}

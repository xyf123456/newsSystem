package com.tt.news.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName: com.tt.news.controller.AdminController
 * @Description:  后台控制器
 * @Author:      Administrator
 * @CreateDate: 2018/11/30 9:39
 * @UpdateUser:   Administrator
 * @Version:        1.0
 **/
@Controller
@RequestMapping("admin")
public class AdminController {

    @RequestMapping("/")
    public String index(){
        return "newspages/admin";
    }
}

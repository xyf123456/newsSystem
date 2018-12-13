package com.tt.news.controller;

import com.tt.news.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName: com.tt.news.controller.LoginController
 * @Description: 登录控制器
 * @Author: Administrator
 * @CreateDate: 2018/11/30 9:10
 * @UpdateUser: Administrator
 * @Version: 1.0
 **/
@Controller
@RequestMapping("login")
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/doLogin", method = RequestMethod.POST)
    public String doLogin(@RequestParam("uname") String name, @RequestParam("upwd") String pwd, HttpServletRequest request) {
//        判断用户是否登录成功
        if (userService.login(name, pwd)) {
//            System.out.println(name);
            request.getSession().setAttribute("name", name);
            return "redirect:/admin/";
        }
        return "redirect:/";
    }

    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request) {
        request.getSession().removeAttribute("name");
        return "redirect:/";
    }
}

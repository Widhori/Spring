package com.caomin.springlibrarysystem.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class userController {
    @RequestMapping("/login")
    public boolean login(String userName, String password, HttpSession session) {
        if(!StringUtils.hasLength(userName) || !StringUtils.hasLength(password)) {
            return false;
        }
        //校验密码是否正确
        if("admin".equals(userName) && "admin".equals(password)) {
            //存session
            session.setAttribute("userName",userName);
            return true;
        }
        return false;
    }
}

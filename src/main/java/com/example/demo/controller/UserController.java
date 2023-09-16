package com.example.demo.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
@Slf4j
public class UserController {

    @RequestMapping("/login")
    public boolean login(HttpServletRequest request, String username, String password){

        if(StringUtils.hasLength(username) && StringUtils.hasLength(password)) {
            if(username.equals("admin")&&password.equals("admin")){
                HttpSession session = request.getSession();
                session.setAttribute("userinfo","admin");
                return true;
            }else {
                return false;
            }
        }
        return false;
    }

    @RequestMapping("/getinfo")
    public String getInfo(){
        log.debug("执行了getinfo方法");
        return "执行了getinfo方法";
    }

    @RequestMapping("/reg")
    public String reg(){
        log.debug("执行了reg方法");
        return "执行了reg方法";
    }
}

package com.example.redissession.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 * @author yinjun
 */
@RestController
@RequestMapping
public class LoginController {
    /**
     * 这里为了能简单在浏览器响应，暂时使用GET请求，
     */
    @PostMapping(value = "login")
    public String login(HttpServletRequest request) {

        return "login failed";
    }


    /**
     * 判断用户的session是否有效（在同一个浏览器中，同一个域中，每次Request请求，都会带上Session）
     */
    @GetMapping(value = "isValid")
    public String isSessionValid(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session == null || session.getAttribute("account") == null) {
            return "no";
        } else {
            return "ok";
        }
    }

    /**
     * 注销登录
     *
     * @param request
     * @return
     */
    @PostMapping(value = "/logout")
    public String logout(HttpServletRequest request) {
        HttpSession session = request.getSession(false);
        if (session != null) {
            session.invalidate();
        }
        return "logout";
    }
}
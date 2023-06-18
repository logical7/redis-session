package com.example.redissession.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author yinjun
 */
@RestController
@RequestMapping(value = "/v2")
public class DemoController {
    @GetMapping(value = "/demo")
    public String test() {
        //访问阿里官网：https://www.aliyun.com/
        final String url = "https://www.aliyun.com/";
        //访问百度官网：https://www.baidu.com/
        final String url1 = "https://www.baidu.com/";
        //访问腾讯官网：https://www.qq.com/
        final String url2 = "https://www.qq.com/";
        //返回数据
        //数据库优化
//缓存优化
//代码优化
//系统优化
//服务器优化
//网络优化
//安全优化

        return "demo--" + new Date();
    }

}

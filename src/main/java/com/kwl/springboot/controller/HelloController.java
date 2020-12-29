package com.kwl.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "<b>我是加粗字体</b>";
    }



    //如果是单独的RequestMapping不能设置为void,一定要页面跳转
    @ResponseBody
    @RequestMapping("/skt")
    public void hello02(){
        System.out.println("测试skt的");
        System.out.println("测试skt的01");

        System.out.println("我是傻逼");
    }

}

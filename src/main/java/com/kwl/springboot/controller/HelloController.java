package com.kwl.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {


    public static void main(String[] args) {
        //测试github,同时更新文件,会不会二选一
        System.out.println("我是傻逼");
        System.out.println("我和源文件一样01");
    }
}

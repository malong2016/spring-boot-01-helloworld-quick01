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
   //我删除了很多文件夹
    }


    public static void main(String[] args) {
        //测试github和idea之间的交互
        System.out.println("idea修改区");
        System.out.println("github修改区");


System.out.println("我是github01,我在48行");

System.out.println("github02,我在450行");


        System.out.println("我是小红,置路由器BBBBBBBBBBBBBBBBBBB");
        System.out.println("测试.......");
System.out.println("测试都是对的.......");
    }

}

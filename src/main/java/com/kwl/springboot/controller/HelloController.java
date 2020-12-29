package com.kwl.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//这个类的所有的方法返回的数据直接写给浏览器(如果是对象就转为JSON数据)
/*@ResponseBody
@Controller*/
//替换上面二个注解,能解析跳转就跳转,不能跳转就解析为json
//@RestController
@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "<b>我是加粗字体</b>";
    }
    //RESTAPI的方式


//    @RequestMapping("/kwl")
//    public String hello02(){
//        return "html";
//    }

}

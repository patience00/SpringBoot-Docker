package com.docker.test.demo.controller;

import org.apache.catalina.servlet4preview.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ${DESCRIPTION}
 *
 * @author 通天晓
 * @create 2018-06-28 22:47
 **/
@Controller
public class TestController {

    @RequestMapping("/index")
    public String index(HttpServletRequest request, Model model) {
        String ip = request.getRemoteAddr();
        model.addAttribute("ip", ip);
        return "home";
    }

    @RequestMapping("/joke")
    public String hahaha() {
        return "list";
    }

    @RequestMapping("/page")
    public String home() {
        return "Hello 拖孩!";
    }

}

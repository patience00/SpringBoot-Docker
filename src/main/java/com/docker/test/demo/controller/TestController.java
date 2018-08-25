package com.docker.test.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ${DESCRIPTION}
 *
 * @author 通天晓
 * @create 2018-06-28 22:47
 **/
@Controller
public class TestController {

    @RequestMapping("/index")
    public String index() {
        return "home";
    }

    @RequestMapping("/page")
    public String home() {
        return "Hello 拖孩!";
    }

}

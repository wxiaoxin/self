package com.xx.self.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wxiao on 2016.9.19.
 *
 * 首页控制器
 *
 */

@Controller
public class IndexController {


    @RequestMapping("/index")
    public String index() {
        return "index";
    }

}

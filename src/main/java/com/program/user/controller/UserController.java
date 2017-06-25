package com.program.user.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by 匡小菜 on 2017/6/25.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("/test")
    public String test(){

        return "test";
    }
}

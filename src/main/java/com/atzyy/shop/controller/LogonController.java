package com.atzyy.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LogonController {

    @RequestMapping("/logon")
    public String toLogon(){
        return "index.html";
    }
}

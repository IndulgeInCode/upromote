package com.web.upromote.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HomeController {

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    private String home(){
        System.out.print("进入controller");
        return "home";
    }
}

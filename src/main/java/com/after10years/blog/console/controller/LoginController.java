package com.after10years.blog.console.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping({"/",""})
    public ModelAndView index(){
        ModelAndView mav = new ModelAndView("/login/index");
        return mav;
    }
}

package com.after10years.blog.console.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/login")
public class LoginController {

    @RequestMapping({"/",""})
    public ModelAndView index(HttpSession httpSession){
        httpSession.setAttribute("a",123);
        ModelAndView mav = new ModelAndView("/login/index");
        return mav;
    }
}

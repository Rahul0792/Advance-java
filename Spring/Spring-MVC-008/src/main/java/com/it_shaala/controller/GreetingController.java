package com.it_shaala.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class GreetingController {
    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public ModelAndView greeting(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("greeting");
        return mav;
    }

}

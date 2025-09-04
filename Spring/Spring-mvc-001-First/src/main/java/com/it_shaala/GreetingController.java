package com.it_shaala;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class GreetingController {

    @RequestMapping(value = "/greet" , method = RequestMethod.GET)
    public ModelAndView greet(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("greet");
        return modelAndView;
    }
}

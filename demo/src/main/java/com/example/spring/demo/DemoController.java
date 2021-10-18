package com.example.spring.demo;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@EnableAutoConfiguration
public class DemoController {
 
    @RequestMapping(value="/", method=RequestMethod.GET)
    public String hello(Model model) {
        model.addAttribute("click", false);
        model.addAttribute("message", "please click!");
        return "demo";
    }

    @RequestMapping(value="/", method=RequestMethod.POST)
    public String click(Model model) {
        model.addAttribute("click", true);
        model.addAttribute("afterClickMsg", "It was clicked.");
        return "demo";
    }

}

package com.danhesoft.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by caowei on 2018/5/8.
 */
@Controller
@RequestMapping("/index")
public class IndexController {

    @RequestMapping("/main")
    public String index(Model model){
        model.addAttribute("username", "曹伟");
        return "index";
    }


}

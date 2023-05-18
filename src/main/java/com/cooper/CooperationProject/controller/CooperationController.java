package com.cooper.CooperationProject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CooperationController {
    @GetMapping ("/")
    public String index () {
        return "index";
    }

    @GetMapping ("/main")
    public String main () {
        return "main";
    }
}

package com.gzd.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class WebController {
    @RequestMapping("/")
    public String index() {return "index";}

    @RequestMapping("/add")
    public String add() {return "add";}
}

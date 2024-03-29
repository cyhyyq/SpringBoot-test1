package com.example.demo.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class IndexController {
    @GetMapping("/hello")
    public String gethello(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model){
        model.addAttribute("name",name);
        return "hello";
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }
}

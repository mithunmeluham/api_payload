package com.meluham.ems.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms")
public class Controller {
    public String loveyou(){
        return "<h1>I Love You Sruthi</h1>";
    }
    
}

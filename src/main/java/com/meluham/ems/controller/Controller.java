package com.meluham.ems.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    @GetMapping("/ms")
    public String loveyou(){
        return "<h1>I Love You Sruthi</h1><br><h1>Happy ROSE DAY</h1><br><h1>love you mithuetta...</h1>";
    }
    
}

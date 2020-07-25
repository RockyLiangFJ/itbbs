package com.missionsky.bbs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ViewController {

       @GetMapping(value = "/{view}")
       public String linkTo(String view){

           return view;
        }
}

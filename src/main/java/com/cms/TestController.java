package com.cms;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
    @GetMapping("/test")
    public String get(){

        return "Welcome Abdul Azeem";
    }



    @ResponseBody
    @RequestMapping("/test2")
    public String get1(){


        return "Welcome Abdul Azeem";
    }
}

package com.yp.serviceribbon.controller;

import com.yp.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    HelloService helloService;


    @RequestMapping(value = "/hi")
    public String hi(@RequestParam("name") String name){
        return helloService.hiService(name);
    }
}

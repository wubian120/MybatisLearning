package cn.brady.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Brady on 2017/7/12.
 */
@RestController
@ComponentScan("cn.brady")
//@EnableAutoConfiguration
public class FirstController {

    @RequestMapping("/")
    @ResponseBody
    public String index(){
        System.out.println("spring boot running");
        return "Hello spring boot.";
    }





}

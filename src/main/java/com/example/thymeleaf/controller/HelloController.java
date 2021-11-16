package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.print.DocFlavor;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","cl");
        return "cl";
    }

    @GetMapping("hello-mvc")
    public String hello_mvc(@RequestParam(required = false) String name, Model model){
        model.addAttribute("name", name);
        return "name";
    }


    @GetMapping("hello-api")
    @ResponseBody
    public Apple helloApi(@RequestParam String sentence){
        Apple apple = new Apple();
        apple.setApple(sentence);

        return apple;
    }

    static class Apple{
        private String apple;

        public String getApple() {
            return apple;
        }

        public void setApple(String apple) {
            this.apple = apple;
        }
    }
}

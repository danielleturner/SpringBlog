package com.codeup.springblog.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloController {

//    @GetMapping("/hello")
//    @ResponseBody
//    public String hello() {
//
//        return "Hello Danny, from Spring!";
//    }
//
//
//  @RequestMapping(path= "/hello/{name}/and/{age}", method = RequestMethod.GET)
//    @ResponseBody
//    public String helloNameAge(@PathVariable String name, @PathVariable int age){
//
//
//        return "Hey user! Thanks for letting me know your name is " + name + ". You also told me your age was " + age + " years old.";
//  }

    // Laura view lecture notes

    @GetMapping(path = "/hello/{name}") // endpoint mapping
    public String sayHello(@PathVariable String name, Model model) {
        model.addAttribute("enteredName", name); // this send the entered name to the html file
//        return "hello"; // return the contents of the html file name "hello.html" in the templates folder.
        return "hello";
    }
}
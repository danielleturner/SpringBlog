package com.codeup.springblog.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class HomeController {

    @GetMapping("/landing")
    @ResponseBody
    public String landingPage() {

        System.out.println("endpoint");
        return "This is the landing page!";
    }
}

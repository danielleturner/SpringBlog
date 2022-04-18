package com.codeup.springblog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
public class PostController {

    @RequestMapping(path = "/post/create", method = RequestMethod.GET)
    @ResponseBody
    public String postBody(@RequestBody String fullName) {

        return "View the form for creating a post ";
    }

    @RequestMapping(path = "/post/create", method = RequestMethod.POST)
    @ResponseBody
    public String createPostView(){

        return "view the form for creating a post";
    }
}

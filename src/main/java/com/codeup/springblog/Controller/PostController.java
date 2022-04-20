package com.codeup.springblog.Controller;

import org.springframework.web.bind.annotation.*;


@RestController
public class PostController {

    @GetMapping("/post")
    @ResponseBody
    public String postBody() {

        return "Index for posts page ";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String PostView(@PathVariable long id){

        return "Future page to show off id: " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String postCreate(){

        return "Form for creating a post ";
    }

    @PostMapping("/post/create")
    @ResponseBody
    public String submitPost(){
        return "create a new post";
    }

}

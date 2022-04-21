package com.codeup.springblog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.codeup.springblog.repositories.PostRepository;


@Controller
public class PostController {

    private final PostRepository postDao;

    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }

    @GetMapping ("/posts")
    public String postBody(Model model) {
        model.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String PostView(@PathVariable long id, Model model){

        model.addAttribute("posts", postDao.findAllById(id));
        return "posts/show";
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

package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
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
        // Refactor your PostController, posts index page, and posts show page to implement create and read functionality.

    }

    @GetMapping("/posts/{id}")
    public String PostView(@PathVariable long id, Model model){

        model.addAttribute("posts", postDao.findAllById(id));
        return "posts/show";
        // Refactor your PostController, posts index page, and posts show page to implement create and read functionality.
    }

    @GetMapping("/posts/create")
    public String postCreate(Model model){
        model.addAttribute("post", new Post());
        return "posts/create";
    }

    @RequestMapping(path = "/posts/create", method = RequestMethod.POST)
//    @ResponseBody
    public String submitPost(@ModelAttribute Post post){
        postDao.save(post);
        return "redirect:/posts";
    }



}

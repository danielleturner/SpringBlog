package com.codeup.springblog.controllers;

import com.codeup.springblog.models.Post;
import com.codeup.springblog.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.codeup.springblog.repositories.PostRepository;
import com.codeup.springblog.repositories.UserRepository;


@Controller
public class PostController {

    private final PostRepository postDao;

    public PostController(PostRepository postDao) {
        this.postDao = postDao;
    }

    @GetMapping ("/posts")
    public String postBody(Model model) {
        model.addAttribute("post", postDao.findAll());
        return "posts/index";
        // Refactor your PostController, posts index page, and posts show page to implement create and read functionality.

    }

    @GetMapping("/posts/{id}")
    public String PostView(@PathVariable long id, Model model){
        model.addAttribute("post", postDao.findAllById(id));
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
        User user = (User) post.getUser();
        post.setUser(user);
        Post editPost = postDao.save(post);
        postDao.save(post);
        return "redirect:/posts" ; //+ post.getId()
    }

//    @GetMapping("/posts/{id}/edit")
//    public String postEdit(Model model){
//        model.addAttribute("id", new Post());
//        return "redirect:/posts" ;
//    }

    @GetMapping("/posts/{id}/edit")
    public String editPost(@PathVariable long id, Model model) {
        model.addAttribute("post", postDao.getById(id));
        return "posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String saveEditPost(@ModelAttribute Post post) {
        postDao.save(post);

        return "redirect:/posts";
    }


    @PostMapping("/posts/{id}/delete")
    public String deletePostById(@PathVariable long id) {
        postDao.deleteById(id);

        return "redirect:/posts";

    }
}

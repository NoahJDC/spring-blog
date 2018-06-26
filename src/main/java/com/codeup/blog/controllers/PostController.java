package com.codeup.blog.controllers;

import com.codeup.blog.models.Post;
import com.codeup.blog.models.User;
import com.codeup.blog.repositories.PostRepositories;
import com.codeup.blog.repositories.UserRepositories;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;


@Controller
public class PostController {


    private final PostRepositories postDao;
    private final UserRepositories userDao;

    public PostController(PostRepositories postDao, UserRepositories userDao){
        this.postDao = postDao;
        this.userDao = userDao;
    }

    //All posts
    @GetMapping("/posts")
    public String index(Model model){
//        List<Post> aListOfPosts = postDao.findAllPosts();
        model.addAttribute("posts", postDao.findAll());
        return "posts/index";
    }
    //Individual post
    @GetMapping("/posts/{id}")
    public String showDetails(@PathVariable long id, Model model){
        model.addAttribute("post", postDao.findOne(id));
        return "posts/show";
    }

    @GetMapping("/posts/{id}/edit")
    public String edit(@PathVariable long id, Model model){
//        return "View the form for editing posts= #" + id;
        model.addAttribute("post", postDao.findOne(id));

        return "posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String updatePost(@PathVariable long id, @ModelAttribute Post post){
        postDao.save(post);
        return "redirect:/posts/";
    }



    @GetMapping("/posts/create")
    public String viewCreate(Model model){
        model.addAttribute("post", new Post());
        return "posts/create";
    }


    @PostMapping("/posts/create")
    public String savePost(@ModelAttribute Post post){
//        User user = userDao.findOne(1L);
        User userSession = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        User user = userDao.findOne(userSession.getId());
        post.setUser(user);
        postDao.save(post);
        return "redirect:/posts";

    }

    @PostMapping("/posts/{id}/delete")
    public String delete(@PathVariable long id){
        postDao.delete(id);
        return "redirect:/posts";
    }



}

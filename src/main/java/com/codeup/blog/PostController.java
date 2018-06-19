package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Controller
public class PostController {



    @GetMapping("/posts")
    public String index(Model model){
        List<Post> aListOfPosts = makeSomePost();
        model.addAttribute("posts", aListOfPosts);
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    public String showDetails(@PathVariable long id, Model model){
        Post post = new Post("Best Title", "Best Body", id);
        model.addAttribute("post", post);
        return "posts/show";
    }

    @GetMapping("/posts/id/edit")
    public @ResponseBody String edit(@PathVariable long id){
        return "View the form for editing posts= #" + id;
    }


    @GetMapping("/posts/create")
    public @ResponseBody String viewCreate(){
        return "view the form for creating a post";
    }

    @PostMapping("/posts/create")
    public @ResponseBody String savePost(){
        return"Create a new posts";
    }

    private List<Post> makeSomePost(){
        return Arrays.asList(
                new Post("The Haunting", "Deez nuts"),
                new Post("I'm hungry", "for deez")
        );
    }

}

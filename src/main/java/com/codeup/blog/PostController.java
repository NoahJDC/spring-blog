package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import sun.misc.Request;

@Controller
public class PostController {

    @GetMapping("/posts")
    public @ResponseBody String posts(){
        return "Posts index page";
    }

    @RequestMapping(path = "/posts/{id}", method = RequestMethod.GET)
    public @ResponseBody String post(@PathVariable int id){
        return String.format("view %d post", id);
    }

    @GetMapping("/posts/create")
    public @ResponseBody String viewCreate(){
        return "view the form for creating a post";
    }

    @RequestMapping(path="/posts/create", method = RequestMethod.POST)
    public @ResponseBody String createForm(){
        return "create a new post";
    }
}

package com.codeup.blog;
import java.util.ArrayList;

import com.codeup.blog.repositories.PostRepositories;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;


@Service
public class PostService {

    private final PostRepositories postDao;

    public PostService(PostRepositories postDao){
        this.postDao = postDao;
    }



}

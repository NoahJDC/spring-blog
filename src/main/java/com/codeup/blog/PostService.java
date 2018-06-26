package com.codeup.blog;
import java.util.ArrayList;

import com.codeup.blog.models.User;
import com.codeup.blog.repositories.PostRepositories;
import com.codeup.blog.repositories.UserRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;


@Service
public class PostService {

    private final PostRepositories postDao;
    private final UserRepositories userDao;

    @Autowired
    public PostService(PostRepositories postDao, UserRepositories userDao){
        this.postDao = postDao;
        this.userDao = userDao;
    }

    public PostRepositories getPostDao(){ return postDao;}




}

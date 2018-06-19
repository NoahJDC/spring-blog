package com.codeup.blog;

import com.sun.tools.javac.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class Post {
    private String title;
    private String body;
    private Long id;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }


    public Post(){}

    public Post(String title, String body){
        this.title = title;
        this.body = body;

    }

    public Post(String title, String body, Long id){
        this.title = title;
        this.body = body;
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

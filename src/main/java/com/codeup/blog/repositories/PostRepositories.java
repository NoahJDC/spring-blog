package com.codeup.blog.repositories;

import com.codeup.blog.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepositories extends CrudRepository<Post, Long> {

}

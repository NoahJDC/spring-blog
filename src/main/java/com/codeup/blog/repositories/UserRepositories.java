package com.codeup.blog.repositories;

import com.codeup.blog.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepositories extends CrudRepository <User, Long>{
}

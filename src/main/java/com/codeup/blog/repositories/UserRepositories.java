package com.codeup.blog.repositories;

import com.codeup.blog.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface UserRepositories extends CrudRepository <User, Long>{

    User findByUsername(String username);

    @Query(nativeQuery = true, value = "SELECT * FROM users LIMIT 1")
    User first();
}

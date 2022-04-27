package com.codeup.springblog.repositories;

import com.codeup.springblog.models.Post;

import com.codeup.springblog.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);
    User findById(long id);
}

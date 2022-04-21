package com.codeup.springblog.repositories;

import com.codeup.springblog.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
    // different ways to search(query) through all post in the database

    Post findAllById(long id); // first query to find all post by the id
}

package com.geekster.recipemanagement.repository;

import com.geekster.recipemanagement.model.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepo extends JpaRepository<Comment,Integer> {
}

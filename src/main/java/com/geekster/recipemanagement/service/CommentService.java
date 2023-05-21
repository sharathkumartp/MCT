package com.geekster.recipemanagement.service;

import com.geekster.recipemanagement.model.Comment;
import com.geekster.recipemanagement.repository.CommentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    CommentRepo commentRepo;

    public Comment addComment(Comment newComment) {
        Comment save = commentRepo.save(newComment);
        return save;
    }


    public List<Comment> getRecipe() {
        List<Comment> all = commentRepo.findAll();
        return all;
    }

    public void deleteComment(Integer id) {
        commentRepo.deleteById(id);
    }
}

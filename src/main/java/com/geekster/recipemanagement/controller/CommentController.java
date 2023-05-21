package com.geekster.recipemanagement.controller;

import com.geekster.recipemanagement.model.Comment;
import com.geekster.recipemanagement.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CommentController {
    @Autowired
    CommentService commentService;

    @PostMapping("/add-comment")
    public ResponseEntity<String> addComment(@RequestBody Comment newComment) {
        Comment comment = commentService.addComment(newComment);
        return new ResponseEntity<String>("saved with id - " + comment.getComment_id(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/get-comment")
    public ResponseEntity<List<Comment>> getComment(){
        List<Comment> comment = commentService.getRecipe();
        return new ResponseEntity<>(comment, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete-comment/{id}")
    public ResponseEntity<String> deleteComment(@PathVariable Integer id){
        commentService.deleteComment(id);
        return new ResponseEntity<>("Comment deleted", HttpStatus.ACCEPTED);
    }

}

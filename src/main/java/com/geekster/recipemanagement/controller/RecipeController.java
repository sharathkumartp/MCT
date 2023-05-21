package com.geekster.recipemanagement.controller;

import com.geekster.recipemanagement.model.Recipe;
import com.geekster.recipemanagement.service.RecipeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RecipeController {
    @Autowired
    RecipeService recipeService;

    @PostMapping("/add-recipe")
    public ResponseEntity addRecipe(@Valid @RequestBody Recipe newRecipe){
        Recipe recipe = recipeService.addRecipe(newRecipe);
        return new ResponseEntity<>("Recipe added with id - "+recipe.getRecipe_id(), HttpStatus.ACCEPTED);
    }

    @GetMapping("/get-recipe")
    public ResponseEntity<List<Recipe>> getRecipe(){
        List<Recipe> recipe = recipeService.getRecipe();
        return new ResponseEntity<>(recipe, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete-recipe/{id}")
    public ResponseEntity<String> DeleteRecipe(@PathVariable Integer id){
        recipeService.deleteRecipe(id);
        return new ResponseEntity<>("Recipe deleted", HttpStatus.ACCEPTED);
    }

    @PutMapping("/update-recipe/{id}")
    public ResponseEntity<String> updateRecipe(@PathVariable Integer id, @RequestBody Recipe updatedRecipe){
        Boolean isPresent=recipeService.updateRecipe(id,updatedRecipe);
        String msg;
        HttpStatus status;
        if(isPresent){
            msg="recipe updated";
            status=HttpStatus.ACCEPTED;
        }else{
            msg="recipe not found";
            status=HttpStatus.BAD_REQUEST;
        }
        return new ResponseEntity<>(msg,status);
    }


}

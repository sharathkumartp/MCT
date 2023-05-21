package com.geekster.recipemanagement.service;

import com.geekster.recipemanagement.model.Recipe;
import com.geekster.recipemanagement.repository.RecipeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecipeService {
    @Autowired
    RecipeRepo recipeRepo;


    public Recipe addRecipe(Recipe newRecipe) {
        Recipe save = recipeRepo.save(newRecipe);
        return save;
    }

    public List<Recipe> getRecipe() {
        List<Recipe> all = recipeRepo.findAll();
        return all;
    }

    public void deleteRecipe(Integer id) {
        recipeRepo.deleteById(id);
    }

    public Boolean updateRecipe(Integer id, Recipe updatedRecipe) {
        Recipe recipe = recipeRepo.findById(id).get();
        if(recipe != null){
            recipe.setRecipe_name(updatedRecipe.getRecipe_name());
            recipe.setIngredients(updatedRecipe.getIngredients());
            recipe.setInstruction(updatedRecipe.getInstruction());
            recipeRepo.save(recipe);
            return true;
        }
        return false;
    }
}

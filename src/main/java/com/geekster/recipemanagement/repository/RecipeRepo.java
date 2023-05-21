package com.geekster.recipemanagement.repository;

import com.geekster.recipemanagement.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepo extends JpaRepository<Recipe,Integer> {
}

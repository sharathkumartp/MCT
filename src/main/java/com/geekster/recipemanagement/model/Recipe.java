package com.geekster.recipemanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer recipe_id;
    @NotBlank(message = "recipe name not blank")
    @NotNull(message = "recipe name not null")
    private String recipe_name;
    @NotBlank(message = "ingredients name not blank")
    @NotNull(message = "ingredients name not null")
    private String ingredients;
    @NotBlank(message = "instruction must not be blank")
    @NotNull(message = "instruction name not null")
    private String instruction;

}

package com.geekster.recipemanagement.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer comment_id;
    @NotNull
    @NotBlank(message = "comment not blank")
    private String comment;
    @ManyToMany(cascade = CascadeType.ALL)
    List<User> userList = new ArrayList<>();
    @ManyToMany(cascade = CascadeType.ALL)
    List<Recipe> reciepList = new ArrayList<>();
}

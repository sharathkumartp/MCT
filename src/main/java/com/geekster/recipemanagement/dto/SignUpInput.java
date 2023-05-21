package com.geekster.recipemanagement.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignUpInput {
    private String name;
    private String email;
    private String phone;
    private String password;
}

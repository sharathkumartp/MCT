package com.geekster.recipemanagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;
    @NotNull(message = "name not null")
    @NotBlank(message = "User name not blanks")
    private String name;
    @NotNull(message = "email not null")
    @Email(message = "please provide valid emails")
    private String email;
    @NotNull(message = "phone not null")
    @Length(message = "must be 10 digit")
    @Min(10)
    private String phone;
    @NotNull(message = "address not null")
    private String password;

    public User( String name, String email, String phone, String password) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }
}

package com.geekster.recipemanagement.repository;

import com.geekster.recipemanagement.model.AuthenticationToken;
import com.geekster.recipemanagement.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITokenRepo extends JpaRepository<AuthenticationToken,Long> {
    AuthenticationToken findByUser(User user);

}

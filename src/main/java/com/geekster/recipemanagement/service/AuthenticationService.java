package com.geekster.recipemanagement.service;

import com.geekster.recipemanagement.model.AuthenticationToken;
import com.geekster.recipemanagement.model.User;
import com.geekster.recipemanagement.repository.ITokenRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthenticationService implements IAuthService{
    @Autowired
    ITokenRepo tokenRepo;

    public void saveToken(AuthenticationToken token) {
        tokenRepo.save(token);
    }

    public AuthenticationToken getToken(User user) {
        return tokenRepo.findByUser(user);
    }
}

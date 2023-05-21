package com.geekster.recipemanagement.service;

import com.geekster.recipemanagement.model.AuthenticationToken;
import com.geekster.recipemanagement.model.User;

public interface IAuthService {
    void saveToken(AuthenticationToken token);
    AuthenticationToken getToken(User user);


}

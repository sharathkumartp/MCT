package com.geekster.recipemanagement.controller;

import com.geekster.recipemanagement.dto.SignInInput;
import com.geekster.recipemanagement.dto.SignInOutput;
import com.geekster.recipemanagement.dto.SignUpInput;
import com.geekster.recipemanagement.dto.SignUpOutput;
import com.geekster.recipemanagement.model.User;
import com.geekster.recipemanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@ComponentScan(basePackages = "package com.geekster.recipemanagement.service")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/create-user")
    public void addUser(@RequestBody User user){
        userService.addUser(user);
    }


    @PostMapping("/signup")
    public SignUpOutput signup(@RequestBody SignUpInput signUpDto)
    {
        return userService.signUp(signUpDto);
    }


    @PostMapping("/signin")
    public SignInOutput signIn(@RequestBody SignInInput signInDto){
        return userService.signIn(signInDto);
    }



    @GetMapping("/get-all-user")
    public ResponseEntity<List<User>> getAllUser(){
        List<User> allUser = userService.getAllUser();
        return new ResponseEntity<>(allUser, HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete-user/{id}")
    public ResponseEntity<String> deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
        return new ResponseEntity<>("User Deleted", HttpStatus.ACCEPTED);
    }

    @PutMapping("/update-user/{id}")
    public ResponseEntity<String> updateUser(@PathVariable Integer id, @RequestBody User updatedUser){
        Boolean isPresent=userService.updateUser(id,updatedUser);
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

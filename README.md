
## MCT

### Frameworks and language

---
* Framework : Spring,SpringBoot
* Language : java (Version 11)

### Data Flow

---
> Controller

* CommentController
    * addComment
    * getComment
    * deleteComment


* RecipeController
    * addRecipe
    * getRecipe
    * DeleteRecipe
    * updateRecipe

* UserController
  * signup
  * signIn
  * getAllUser
  * deleteUser
  * updateUser


> Service

* AuthenticationService
* CommentService
* IAuthService
* RecipeService
* UserService

> Repository
* CommentRepo
* ITokenRepo
* RecipeRepo
* UserRepo

> dto

* SignInInput
* SignInOutput
* SignUpInput
* SignUpOutput

### Database used in project

* Mysql

### Project Summary

This is a __recipe-management-API__ built with Java Spring Boot, using an Mysql database engine and Maven build tool. In this app user wants to do signup and signin features are implemented.User needs to signup and signin to get the token for session and make API requests. The project follows the Model-View-Controller (MVC) architecture pattern, with separate layers for controller, service, and repository.This app is deployed in aws server.

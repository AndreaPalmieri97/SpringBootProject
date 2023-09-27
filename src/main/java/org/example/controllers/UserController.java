package org.example.controllers;

import org.apache.coyote.Response;
import org.example.models.User;
import org.example.repositories.UserRepository;
import org.example.services.LogService;
import org.example.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    private UserService userService;
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/create")
    public ResponseEntity<User> createUser(@RequestBody User user){
        User u = this.userService.saveUser(user);
        return new ResponseEntity<>(u, HttpStatus.OK);
    }

}

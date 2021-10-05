package com.rohan2596.springbootmongodb.controller;

import com.rohan2596.springbootmongodb.model.AddUserRequest;
import com.rohan2596.springbootmongodb.model.EditUserRequest;
import com.rohan2596.springbootmongodb.model.UserResponse;
import com.rohan2596.springbootmongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public UserResponse addUser(@RequestBody AddUserRequest request){
      return userService.add(request);
    }

    @PutMapping
    public UserResponse updateUser(@RequestBody EditUserRequest request){
        return userService.update(request);
    }

    @GetMapping
    public UserResponse getUserById(@RequestParam String id){
        return userService.getById(id);
    }

    @DeleteMapping
    public boolean deleteById(@RequestParam String id){
        return userService.delete(id);
    }


}


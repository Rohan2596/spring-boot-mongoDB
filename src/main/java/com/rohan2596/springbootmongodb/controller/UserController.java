package com.rohan2596.springbootmongodb.controller;

import com.rohan2596.springbootmongodb.model.AddUserRequest;
import com.rohan2596.springbootmongodb.model.EditUserRequest;
import com.rohan2596.springbootmongodb.model.UserResponse;
import com.rohan2596.springbootmongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/*
 * @author : Rohan Kadam
 * @github : Rohan2596
 * @medium : https://rohankadam965.medium.com/
 * */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    /*
     * @method :- addUser
     * @Description :- Adding New User To database;
     * @params:- AddUserRequest
     * */
    @PostMapping
    public UserResponse addUser(@RequestBody AddUserRequest request){
      return userService.add(request);
    }

    /*
     * @method :- updateUser
     * @Description :- Update the Current user email and password
     * @params:- EditRequest
     * */
    @PutMapping
    public UserResponse updateUser(@RequestBody EditUserRequest request){
        return userService.update(request);
    }


    /*
     * @method :- getUserById
     * @Description :- Get Current User Based on Id
     * @params:- Id
     * */
    @GetMapping
    public UserResponse getUserById(@RequestParam String id){
        return userService.getById(id);
    }

    /*
     * @method :- deleteById
     * @Description :- Delete User Based on Id
     * @params:- Id
     * */
    @DeleteMapping
    public boolean deleteById(@RequestParam String id){
        return userService.delete(id);
    }


}


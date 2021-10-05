package com.rohan2596.springbootmongodb.service;

import com.rohan2596.springbootmongodb.entity.User;
import com.rohan2596.springbootmongodb.model.AddUserRequest;
import com.rohan2596.springbootmongodb.model.EditUserRequest;
import com.rohan2596.springbootmongodb.model.UserResponse;
import com.rohan2596.springbootmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/*
 * @author : Rohan Kadam
 * @github : Rohan2596
 * @medium : https://rohankadam965.medium.com/
 * */
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    /*
     * @method :- Create User
     * @Description :- Create new user email and password
     * @params:- AddUserRequest
     * */
    public UserResponse add(AddUserRequest request) {
        User user = userRepository.save(new User(request));
        return new UserResponse(user);
    }

    /*
     * @method :- updateUser
     * @Description :- Update the Current user email and password
     * @params:- EditRequest
     * */
    public UserResponse update(EditUserRequest request) {
        Optional<User> optionalUser = userRepository.findById(request.id);
        if (optionalUser.isEmpty()) {
            return null;
        }
        return new UserResponse(optionalUser.get());
    }

    /*
     * @method :- getUserById
     * @Description :- Get Current User Based on Id
     * @params:- Id
     * */
    public UserResponse getById(String id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isEmpty()) {
            return null;
        }
        return new UserResponse(optionalUser.get());
    }

    /*
     * @method :- deleteById
     * @Description :- Delete User Based on Id
     * @params:- Id
     * */
    public boolean delete(String id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isEmpty()) {
            return false;
        }
        userRepository.deleteById(optionalUser.get().getId());
        return true;
    }
}

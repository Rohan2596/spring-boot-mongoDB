package com.rohan2596.springbootmongodb.service;

import com.rohan2596.springbootmongodb.entity.User;
import com.rohan2596.springbootmongodb.model.AddUserRequest;
import com.rohan2596.springbootmongodb.model.EditUserRequest;
import com.rohan2596.springbootmongodb.model.UserResponse;
import com.rohan2596.springbootmongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserResponse add(AddUserRequest request) {
        User user = userRepository.save(new User(request));
        return new UserResponse(user);
    }

    public UserResponse update(EditUserRequest request) {
        Optional<User> optionalUser = userRepository.findById(request.id);
        if (optionalUser.isEmpty()) {
            return null;
        }
        return new UserResponse(optionalUser.get());
    }

    public UserResponse getById(String id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isEmpty()) {
            return null;
        }
        return new UserResponse(optionalUser.get());
    }

    public boolean delete(String id) {
        Optional<User> optionalUser = userRepository.findById(id);
        if (optionalUser.isEmpty()) {
            return false;
        }
        userRepository.delete(optionalUser.get());
        return true;
    }
}

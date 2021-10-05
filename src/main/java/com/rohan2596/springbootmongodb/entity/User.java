package com.rohan2596.springbootmongodb.entity;

import com.rohan2596.springbootmongodb.model.AddUserRequest;
import com.rohan2596.springbootmongodb.model.EditUserRequest;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
public class User {

    @Id
    private String id;
    private String emailAddress;
    private String password;
    private LocalDateTime createdOn;
    private LocalDateTime updatedOn;

    public User(AddUserRequest request) {
        this.emailAddress=request.emailId;
        this.password=request.password;
        this.createdOn=LocalDateTime.now();
        this.updatedOn=LocalDateTime.now();
    }

    public User() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(LocalDateTime createdOn) {
        this.createdOn = createdOn;
    }

    public LocalDateTime getUpdatedOn() {
        return updatedOn;
    }

    public void setUpdatedOn(LocalDateTime updatedOn) {
        this.updatedOn = updatedOn;
    }
}

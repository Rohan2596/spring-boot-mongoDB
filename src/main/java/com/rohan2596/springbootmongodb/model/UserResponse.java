package com.rohan2596.springbootmongodb.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rohan2596.springbootmongodb.entity.User;

import java.time.LocalDateTime;
/*
 * @author : Rohan Kadam
 * @github : Rohan2596
 * @medium : https://rohankadam965.medium.com/
 * */
public class UserResponse {

    @JsonProperty("id")
    private String id;
    @JsonProperty("email-address")
    private String emailAddress;
    @JsonProperty("password")
    private String password;
    @JsonProperty("created-on")
    private LocalDateTime createdOn;
    @JsonProperty("updated-on")
    private LocalDateTime updatedOn;


    public UserResponse(User user) {
        this.id= user.getId();
        this.emailAddress= user.getEmailAddress();
        this.password= user.getPassword();
        this.createdOn=user.getCreatedOn();
        this.updatedOn=user.getUpdatedOn();
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

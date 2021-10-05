package com.rohan2596.springbootmongodb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/*
 * @author : Rohan Kadam
 * @github : Rohan2596
 * @medium : https://rohankadam965.medium.com/
 * */
public class AddUserRequest {

    @JsonProperty("emailId")
    public String emailId;
    @JsonProperty("password")
    public String password;
}

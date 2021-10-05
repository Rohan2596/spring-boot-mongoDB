package com.rohan2596.springbootmongodb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AddUserRequest {

    @JsonProperty("emailId")
    public String emailId;
    @JsonProperty("password")
    public String password;
}

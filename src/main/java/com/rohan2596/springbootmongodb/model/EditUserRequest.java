package com.rohan2596.springbootmongodb.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EditUserRequest extends AddUserRequest{

    @JsonProperty("id")
    public String  id;

}

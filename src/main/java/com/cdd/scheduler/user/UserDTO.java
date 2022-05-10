package com.cdd.scheduler.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class UserDTO {
    @JsonProperty(access = Access.READ_ONLY)
    public Long userID;
    public String username;
    @JsonProperty(access = Access.WRITE_ONLY)
    public String password;
}

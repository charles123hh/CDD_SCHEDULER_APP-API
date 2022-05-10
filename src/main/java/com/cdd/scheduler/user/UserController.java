package com.cdd.scheduler.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/users")
public class UserController {
    
    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> getUsers(){
        return this.userService.fetchUsers();
    }

}

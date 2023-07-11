package com.backend.server.controller;

import com.backend.server.Model.Inventory;
import com.backend.server.Model.User;
import com.backend.server.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserApis {

    @Autowired
    UserService userService;

    @PostMapping("/login")
    public void userLogin(){}
    
    @GetMapping("/getUser")
    public Optional<User> getUser(@RequestParam("mobileMumber") String mobileNumber){
        return(userService.getUser(mobileNumber));
    }


    

}

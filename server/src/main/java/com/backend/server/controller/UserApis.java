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
    
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){

        return(userService.addUser(user));
    }
    
    @GetMapping("/getUser")
    public Optional<User> getUser(@RequestParam("mobileMumber") String mobileNumber){
        return(userService.getUser(mobileNumber));
    }
   

    @PostMapping("/updateUser")
    public User updateUser(@RequestBody User user){
        return(userService.updateUser(user));
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(@RequestParam String mobileNumber){
        return userService.deleteUser(mobileNumber);
    }


    

}

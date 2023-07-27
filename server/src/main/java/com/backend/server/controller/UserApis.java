// See [Issue6] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/6)
package com.backend.server.controller; // Package declaration for the "controller" package under "com.backend.server"

import com.backend.server.Model.Inventory; // Import the Inventory model class
import com.backend.server.Model.User; // Import the User model class
import com.backend.server.service.UserService; // Import the UserService class
import org.springframework.beans.factory.annotation.Autowired; // Import Spring annotation for dependency injection
import org.springframework.web.bind.annotation.*; // Import Spring Web annotations for controller and request mapping


import java.util.Optional; // Import Java utility class for Optional

@RestController // Indicates that this class is a REST controller
@RequestMapping("/users") // Base URL mapping for all endpoints in this controller
public class UserApis {

    @Autowired // Enables automatic injection of a UserService bean
    UserService userService;

    @PostMapping("/login") // HTTP POST endpoint for user login (empty body)
    public void userLogin(){
        // Implementation for user login goes here
        // Since the method is void, no data is returned in the response
        // You can add the necessary logic to authenticate and handle user login in this method
    }
    // See [Issue12] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/12)
    @PostMapping("/addUser") // HTTP POST endpoint to add a new user
    public User addUser(@RequestBody User user){ // Request body contains the new User information

        return(userService.addUser(user)); // Call the UserService to add the user and return the added user
    }
    
    @GetMapping("/getUser") // HTTP GET endpoint to retrieve a user by mobile number
    public Optional<User> getUser(@RequestParam("mobileMumber") String mobileNumber){
        return(userService.getUser(mobileNumber)); // Call the UserService to get the user by mobile number and return it (or null if not found)
    }
   

    @PostMapping("/updateUser") // HTTP POST endpoint to update an existing user
    public User updateUser(@RequestBody User user){ // Request body contains the updated User information
        return(userService.updateUser(user)); // Call the UserService to update the user and return the updated user
    }

    @DeleteMapping("/deleteUser") // HTTP DELETE endpoint to delete a user by mobile number
    public String deleteUser(@RequestParam String mobileNumber){ // Request parameter "mobileNumber" specifies the mobile number of the user to delete
        return userService.deleteUser(mobileNumber); // Call the UserService to delete the user by mobile number and return a status message
    }


    

}

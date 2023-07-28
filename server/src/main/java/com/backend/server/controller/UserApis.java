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

/**
 * @class UserApis
 * @brief A class representing the user service apis.
 * The class in the provided code is a REST controller responsible for handling HTTP requests related to user operations. 
 * It provides API endpoints that allow clients to interact with the user service and perform CRUD (Create, Read, Update, Delete) operations on user data.
 * @Autowired Enables automatic injection of a UserService bean
 */
public class UserApis {

    @Autowired
    UserService userService;

    /**
     * @brief Implementation for user login goes here.
     * @pre The database connection must be established and valid.
     * Since the method is void, no data is returned in the response.
     * @post HTTP POST endpoint for user login (empty body)
     * You can add the necessary logic to authenticate and handle user login in this method
     */
    
    @PostMapping("/login")  
    public void userLogin(){
    }

    /**
     * @brief Implementation for adding new user Information.
     *
     * This method is responsible for processing incoming HTTP POST requests to add a user, 
     * and it allows clients to add new user data to the backend.
     * @param user is used to receive the new user information from the client as part of the HTTP POST request's request body.
     * @pre The database connection must be established and valid.
     * @return the added user by calling UserService to add the user.
     * @post HTTP POST endpoint for user login (empty body).
     * See [Issue12] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/12).
     */
    
    @PostMapping("/addUser") 
    public User addUser(@RequestBody User user){ 

        return(userService.addUser(user)); 
    }

     /**
     * @brief Implementation for retrieve a user by mobile number.
     *
     * This method is used to retrieve a user from the system based on their mobile number.
     * @param mobileNumber is used to receive the mobile number of the user from the client as part of the HTTP GET request's query parameters.
     * @pre The database connection must be established and valid.
     * @return the user by mobile number or null if not found by calling UserService.
     * See [Issue12] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/12).
     */
    
    @GetMapping("/getUser") // HTTP GET endpoint to retrieve a user by mobile number
    public Optional<User> getUser(@RequestParam("mobileMumber") String mobileNumber){
        return(userService.getUser(mobileNumber)); // Call the UserService to get the user by mobile number and return it (or null if not found)
    }
   
    /**
     * @brief Updating the existing user.
     *
     * This method is used to update an existing user in the system.
     * @param user is used to receive the updated user information from the client as part of the HTTP POST request's request body.
     * @pre The database connection must be established and valid.
     * @return the updated user by calling UserService to update the user.
     * See [Issue12] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/12).
     */
    
    @PostMapping("/updateUser") // HTTP POST endpoint to update an existing user
    public User updateUser(@RequestBody User user){ // Request body contains the updated User information
        return(userService.updateUser(user)); // Call the UserService to update the user and return the updated user
    }

    /**
     * @brief Deleting a user by mobile number.
     *
     * This method is used to delete a user from the system based on their mobile number.
     * @param mobileNumber is used to receive the mobile number of the user from the client as part of the HTTP GET request's query parameters.
     * @pre The database connection must be established and valid.
     * @return a status message by calling UserService to delete the user by mobile number.
     * See [Issue12] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/12).
     */
    
    @DeleteMapping("/deleteUser") 
    public String deleteUser(@RequestParam String mobileNumber){ 
        return userService.deleteUser(mobileNumber); 
    }


    

}

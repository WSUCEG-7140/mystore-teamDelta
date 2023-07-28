package com.backend.server.service; // Package declaration for the "service" package under "com.backend.server"

import com.backend.server.Model.Inventory; // Import the Inventory model class
import com.backend.server.Model.User; // Import the User model class
import java.util.List; // Import Java utility class for List

import java.util.Optional; // Import Java utility class for Optional

/**
 * @brief This UserService interface defines the contract for the UserService.
 * This is the name of the interface, which indicates its purpose of providing user-related services.
 *
 */

public interface UserService {

    /**
     * @brief addUser Method signature for adding a new user to the system.
     * @param user The method takes a User object as input and returns the added User object.
     * The implementation of this method will handle the logic to add the user to the system and persist it in the database.
     * @returns the added user name.
     * See [Issue12] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/12)
     */
    
    public User addUser(User user);

    /**
     * @brief getUser Method signature for retrieving a user by their email from the system.
     * @param email The method takes the user's email (String) as input.
     * @returns an Optional containing the User object if found, or an empty Optional if not found.
     * 
     * See [Issue12] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/12)
     */
    
    public Optional<User> getUser(String email);

     /**
     * @brief updateUser Method signature for updating an existing user in the system.
     * @param user The method takes a User object representing the updated user as input.
     * The implementation of this method will handle the logic to update the user's information in the database.
     * @returns the updated user name.
     * See [Issue12] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/12)
     */

    User updateUser(User user);

    /**
     * @brief deleteUser Method signature for deleting a user from the system based on their mobile number.
     * @param mobilenumber, The method takes the user's mobile number (String) as input. 
     * The implementation of this method will handle the logic to remove the user from the database based on their mobile number.
     * @returns a status message (String) indicating the success of the operation.
     * See [Issue12] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/12)
     */

    String deleteUser(String mobileNumber);

    /**
     * @brief getAllUser Method signature for retrieving all users in the system.
     * The method gets a List of all User objects present in the system.
     * @returns a list of users
     * See [Issue12] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/12)
     */
    
    public List<User> getAllUser();

     /**
     * @brief addItemToCart Method signature for adding an inventory item to a user's cart.
     * The method takes an Inventory object representing the item to be added and a User object representing the user's cart.
     * The implementation of this method will handle the logic to add the inventory item to the user's cart and update the cart in the database.
     * @param inventory, user This parameter is of type Inventory, and it represents the item that the user wants to add to their cart.
     * This parameter is of type User, and it represents the user who wants to add an item to their cart
     * @returns a added inventory item.
     * See [Issue12] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/12)
     */

   Inventory addItemToCart(Inventory inventory,User user);
}

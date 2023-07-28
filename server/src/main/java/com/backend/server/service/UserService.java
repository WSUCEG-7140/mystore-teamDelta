package com.backend.server.service; // Package declaration for the "service" package under "com.backend.server"

import com.backend.server.Model.Inventory; // Import the Inventory model class
import com.backend.server.Model.User; // Import the User model class
import java.util.List; // Import Java utility class for List

import java.util.Optional; // Import Java utility class for Optional

/**
 * @brief This This UserService interface defines the contract for the UserService.
 *
 */

public interface UserService {

    /**
     * @brief addUser Method signature for adding a new user to the system.
     * The method takes a User object as input and returns the added User object.
     * The implementation of this method will handle the logic to add the user to the system and persist it in the database.
     *
     * See [Issue12] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/12)
     */
    
    public User addUser(User user);

    /**
     * @brief getUser Method signature for retrieving a user by their email from the system.
     * The method takes the user's email (String) as input and returns an Optional containing the User object if found,
     * or an empty Optional if not found.
     *
     * See [Issue12] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/12)
     */
    
    public Optional<User> getUser(String email);

     /**
     * @brief updateUser Method signature for updating an existing user in the system.
     * The method takes a User object representing the updated user as input and returns the updated User object.
     * The implementation of this method will handle the logic to update the user's information in the database.
     *
     * See [Issue12] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/12)
     */

    User updateUser(User user);

    /**
     * @brief deleteUser Method signature for deleting a user from the system based on their mobile number.
     * The method takes the user's mobile number (String) as input and returns a status message (String) indicating the success of the operation.
     * The implementation of this method will handle the logic to remove the user from the database based on their mobile number.
     *
     * See [Issue12] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/12)
     */

    String deleteUser(String mobileNumber);

    /**
     * @brief getAllUser Method signature for retrieving all users in the system.
     * The method returns a List of all User objects present in the system.
     *
     * See [Issue12] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/12)
     */
    
    public List<User> getAllUser();

     /**
     * @brief addItemToCart Method signature for adding an inventory item to a user's cart.
     * The method takes an Inventory object representing the item to be added and a User object representing the user's cart.
     * The implementation of this method will handle the logic to add the inventory item to the user's cart and update the cart in the database.
     *
     * See [Issue12] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/12)
     */

   Inventory addItemToCart(Inventory inventory,User user);
}

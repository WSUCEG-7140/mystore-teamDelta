package com.backend.server.service; // Package declaration for the "service" package under "com.backend.server"

import com.backend.server.Model.Inventory; // Import the Inventory model class
import com.backend.server.Model.User; // Import the User model class
import com.backend.server.repository.UserRepository; // Import the UserRepository interface
import org.springframework.beans.factory.annotation.Autowired; // Import Spring annotation for dependency injection
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; // Import Spring Security class for BCrypt password encoder
import org.springframework.stereotype.Service; // Import Spring annotation for service
import java.util.List; // Import Java utility class for List

import java.util.Optional; // Import Java utility class for Optional

/**
 * @class UserServiceImpl
 * @brief This UserServiceImpl implements the UserService interface and provides the implementation for user management and cart functionality.
 * @Service Indicates that this class is a Spring service
 * @Autowired Enables automatic injection of a UserRepository bean
 * 
 * store and retrieve user-related information in the WrightFlightManager application.
 */

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;
    
    /**
     * @brief addUser Method to add a new user to the system.
     * The method takes a User object as input and returns the added User object.
     * <p>
     * Encrypt the user's password using BCryptPasswordEncoder before saving it in the database
     * Save the new user using the UserRepository and return the added user object.
     * See [Issue12] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/12)
     */

    @Override
    public User addUser(User user) {
        user.setPassword(new BCryptPasswordEncoder().encode(user.getPassword()));
        return userRepository.save(user);
    }
    
    /**
     * @brief getUser Method to retrieve a user by their mobile number from the system.
     * The method takes the user's mobile number (String) as input and returns an Optional containing the User object if found,
     * or an empty Optional if not found.
     * <p>
     * Retrieve the user with the specified mobile number using the UserRepository and return it as an Optional.
     * See [Issue12] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/12)
     */

    @Override
    public Optional<User> getUser(String mobileNumber) {
        return(userRepository.findById(mobileNumber));
    }
    
    /**
     * @brief updateUser Method to update an existing user in the system.
     * The method takes a User object representing the updated user as input and returns the updated User object.
     * <p>
     * Save the updated user using the UserRepository and return the updated user object.
     * See [Issue12] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/12)
     */
    
    @Override
    public User updateUser(User user) {
        return userRepository.save(user);
    }

    /**
     * @brief deleteUser Method to delete a user from the system based on their mobile number.
     * The method takes the user's mobile number (String) as input and returns a status message (String) indicating the success of the operation.
     * <p>
     * Delete the user with the specified mobile number using the UserRepository.
     * Return a success message indicating that the user was deleted successfully.
     * See [Issue12] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/12)
     */
    
    @Override
    public String deleteUser(String mobileNumber) {
       userRepository.deleteById(mobileNumber);
        return("UserDeleted Successfully");
    }

    /**
     * @brief addItemToCart Method to add an inventory item to a user's cart.
     * The method takes an Inventory object representing the item to be added and a User object representing the user's cart.
     * The implementation of this method will handle the logic to add the inventory item to the user's cart and update the cart in the database.
     * <p>
     * Add the inventory item to the user's cart list.
     * Save the updated user with the modified cart using the UserRepository.
     * Return the added inventory item.
     * See [Issue26] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/26)
     */
    
   @Override
   public Inventory addItemToCart(Inventory inventory,User user) {
       user.getCart().add(inventory);
        userRepository.save(user);
       return inventory;
   }

    /**
     * @brief getAllUser Method to retrieve all users in the system.
     * The method returns a List of all User objects present in the system.
     * <p>
     * Retrieve all users using the UserRepository and return them as a List.
     * See [Issue35] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/35)
     */
    
    @Override
    public List<User> getAllUser() {
        return(userRepository.findAll());
    }

}

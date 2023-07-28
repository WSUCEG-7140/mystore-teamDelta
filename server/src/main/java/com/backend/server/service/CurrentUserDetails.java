package com.backend.server.service; // Package declaration for the "service" package under "com.backend.server"

import com.backend.server.Model.User; // Import the User model class
import com.backend.server.repository.UserRepository; // Import the UserRepository interface
import org.springframework.beans.factory.annotation.Autowired; // Import Spring annotation for dependency injection
import org.springframework.context.annotation.Bean; // Import Spring annotation for defining a bean
import org.springframework.security.core.userdetails.UserDetails; // Import Spring Security core interface for UserDetails
import org.springframework.security.core.userdetails.UserDetailsService; // Import Spring Security core interface for UserDetailsService
import org.springframework.security.core.userdetails.UsernameNotFoundException; // Import Spring Security exception for username not found
import org.springframework.stereotype.Service; // Import Spring annotation for service

import java.util.Optional; // Import Java utility class for Optional

/**
 * @class CurrentUserDetails
 * @brief the class CurrentUserDetails serves as an implementation of the Spring Security UserDetailsService interface.
 *
 * The UserDetailsService interface provides a single method, loadUserByUsername, 
 * that must be implemented to load user details based on the provided username.
 */

@Service("userDetailsService") 
public class CurrentUserDetails implements UserDetailsService {
    @Autowired // Enables automatic injection of a UserRepository bean
    UserRepository userRepository;
    @Override

    /**
     * UserDetails constructor takes a String as input to allow testing of the exception
     * handling within the computeHash method
     * This method is called by Spring Security during authentication to load user details based on the provided username (mobile number)
     *
     * @param username         The name of the algorithm that MessageDigest will use
     *                          to compute hashes
     * See [Issue57] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/57)
     * @returns UserDetails by Creating a new CurrentUser object with the found User object.
     */
    
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> user=userRepository.findById(username); // Find the user by their mobile number (username)
        if(user==null){ // Check if the user is present in the Optional (exists in the database)
            throw new UsernameNotFoundException("User not found"); // Throw an exception if the user is not found
        }
        return new CurrentUser(user);
    }

}

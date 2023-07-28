package com.backend.server.service; // Package declaration for the "service" package under "com.backend.server"

import com.backend.server.Model.User; // Import the User model class
import org.springframework.security.core.GrantedAuthority; // Import Spring Security core interface for GrantedAuthority
import org.springframework.security.core.authority.SimpleGrantedAuthority; // Import Spring Security class for SimpleGrantedAuthority
import org.springframework.security.core.userdetails.UserDetails; // Import Spring Security core interface for UserDetails
import org.springframework.stereotype.Service; // Import Spring annotation for service

import java.util.Collection; // Import Java utility class for Collection
import java.util.Collections; // Import Java utility class for Collections
import java.util.Optional; // Import Java utility class for Optional

/**
 * @class CurrentUser
 * @brief This class represents an user details.
 *
 * The CurrentUser class encapsulates information about an user.
 * Objects of this class can be used to store and retrieve 
 * user-related information in the Mystore application.
 */

@Service // Indicates that this class is a Spring service
public class CurrentUser implements UserDetails {

    private User user; // Reference to the User object for the current user
    
    /**
     * @brief The CurrentUser constructor creates a new CurrentUser object from an Optional<User> object
     * (cannot build an CurrentUser object with a non-parameterized constructor).
     * <p>
     * The CurrentUser constructor creates a new CurrentUser object from an Optional<User> object
     * (cannot build an CurrentUser object with a non-parameterized constructor)
     *@param user is used to reference the User object representing the details of the current user
     * See [Issue36] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/36)
     */
    
    // Constructor to create a CurrentUser object from an Optional<User> object
    public CurrentUser(Optional<User> user) {
        super();
        this.user=user.get(); // Extract the User object from the Optional and assign it to the "user" field
    }

    /** 
     * @brief This Return a collection of GrantedAuthority representing the user's authorities or roles
     * In this case, we are returning a singleton set containing a SimpleGrantedAuthority with the role "USER"
     * See [Issue36] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/36)
     */

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority("USER"));
    }

    /**
     * @brief Retrieves the User password.
     * <p>
     * The getPassword method takes no parameters and returns the User password
     * See [Issue36] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/36)
     * @return  A String representing the User password for authentication.
     */

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    /**
     * @brief Retrieves the User Mobile number.
     * <p>
     * The getUsername method takes no parameters and returns the User Mobile number
     * See [Issue36] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/36)
     * @return  A String representing the User Mobile number as user name.
     */

    @Override
    public String getUsername() {
        return user.getMobileNumber();
    }

    /**
     * @brief Retrieves that User Account expired or not.
     * <p>
     * The isAccountNonExpired method takes no parameters and returns that User Account expired or not
     * See [Issue36] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/36)
     * @return true to indicate that the user's account is not expired.
     */

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    /**
     * @brief Retrieves that User Account is locked or not.
     * <p>
     * The isAccountNonLocked method takes no parameters and returns that User Account is locked or not.
     * See [Issue36] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/36)
     * @return true to indicate that the user's account is not locked.
     */

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    /**
     * @brief Retrieves that User credentials are not expired.
     * <p>
     * The isCredentialsNonExpired method takes no parameters and returns that User credentials are not expired.
     * See [Issue36] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/36)
     * @return true to indicate that the user's credentials are not expired.
     */

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    /**
     * @brief Retrieves that user's account is enabled.
     * <p>
     * The isEnabled method takes no parameters and returns that user's account is enabled.
     * See [Issue36] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/36)
     * @return true to indicate that the user's account is enabled.
     */

    @Override
    public boolean isEnabled() {
        return true;
    }
}

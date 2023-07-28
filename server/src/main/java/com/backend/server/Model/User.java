package com.backend.server.Model; // Package declaration for the "Model" package under "com.backend.server"

import com.fasterxml.jackson.annotation.JsonInclude; // Import Jackson annotation for JSON serialization options
import lombok.AllArgsConstructor; // Import Lombok annotation for generating all-argument constructor
import lombok.Builder; // Import Lombok annotation for generating builder pattern
import lombok.Data; // Import Lombok annotation for generating getters, setters, equals, hashCode, and toString methods
import lombok.NoArgsConstructor; // Import Lombok annotation for generating no-argument constructor
import org.springframework.data.annotation.Id; // Import Spring Data annotation for marking the ID field
import org.springframework.data.mongodb.core.mapping.Document; // Import Spring Data annotation for MongoDB document mapping

import java.util.ArrayList; // Import Java utility class for ArrayList
import java.util.List; // Import Java utility class for List

@Data // Lombok annotation to generate getters, setters, equals, hashCode, and toString methods
@AllArgsConstructor // Lombok annotation to generate all-argument constructor
@NoArgsConstructor // Lombok annotation to generate no-argument constructor
@Builder // Lombok annotation to generate builder pattern
@Document(collection = "user") // MongoDB document mapping for the "user" collection
//@JsonInclude(JsonInclude.Include.NON_NULL)
    
/**
 * @class User
 * @brief This class represents an User with its email, firstname, lastname, mobilenumber, password, address, zipcode and role.
 *
 * The User class encapsulates information about an User. Objects of this class can be used to
 * store and retrieve User-related information in the Mystore application.
 * See [Issue6] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/6).
 */
    
public class User {
    private String email; // Email address of the user
    private String firstName; // First name of the user
    private String lastName; // Last name of the user
    @Id // Marks the field below as the identifier field for MongoDB
    private String mobileNumber; // Unique mobile number of the user
    private String password; // Password of the user
    private List<Inventory> cart=new ArrayList<>(); // List to store the user's inventory cart items
    private String addressLine1; // Address line 1 of the user
    private String addressLine2; // Address line 2 of the user (optional)
    private String zipCode; // Zip code of the user's address
    private String role; // Role of the user (e.g., admin, customer, etc.)

}

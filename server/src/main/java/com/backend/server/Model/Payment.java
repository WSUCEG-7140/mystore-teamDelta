"""@ref R30_0"""
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
@Document(collection = "payment") // MongoDB document mapping for the "payment" collection
//@JsonInclude(JsonInclude.Include.NON_NULL) // Commented out Jackson annotation to exclude properties with null values from JSON serialization (optional)
// See [Issue30] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/30)
public class Payment{
    
    @Id // Marks the field below as the identifier field for MongoDB
    private String paymentId; // Unique identifier for the payment
    private String paymentMode; // Mode of the payment (e.g., credit card, PayPal, etc.)
    private String amount; // Amount of the payment
    private String Status; // Status of the payment (e.g., pending, completed, etc.)

}

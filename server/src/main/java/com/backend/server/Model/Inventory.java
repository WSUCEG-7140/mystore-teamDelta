package com.backend.server.Model;

import com.fasterxml.jackson.annotation.JsonInclude; // Import Jackson annotation for JSON serialization options
import lombok.AllArgsConstructor; // Import Lombok annotation for generating all-argument constructor
import lombok.Builder; // Import Lombok annotation for generating builder pattern
import lombok.Data; // Import Lombok annotation for generating getters, setters, equals, hashCode, and toString methods
import lombok.NoArgsConstructor; // Import Lombok annotation for generating no-argument constructor
import org.springframework.data.annotation.Id; // Import Spring Data annotation for marking the ID field
import org.springframework.data.mongodb.core.mapping.Document; // Import Spring Data annotation for MongoDB document mapping

@Data // Lombok annotation to generate getters, setters, equals, hashCode, and toString methods
@AllArgsConstructor // Lombok annotation to generate all-argument constructor
@NoArgsConstructor // Lombok annotation to generate no-argument constructor
@Builder // Lombok annotation to generate builder pattern
@Document(collection = "inventory") // MongoDB document mapping for the "inventory" collection
@JsonInclude(JsonInclude.Include.NON_NULL) // Jackson annotation to exclude properties with null values from JSON serialization

/**
 * @class Inventory
 * @brief This class represents an Inventory with its ID ,name, category, cost and supplier.
 *
 * The Inventory class encapsulates information about an Inventory, including its unique
 * Inventory code (itemID) and its name, category, cost, supplier. Objects of this class can be used to
 * store and retrieve Inventory-related information in the Mystore application.
 */
    
public class Inventory {
    @Id // Marks the field below as the identifier field for MongoDB
    private int itemId; // Unique identifier for the inventory item
    private String itemName; // Name of the inventory item
    private String category; // Category of the inventory item
    private int cost; // Cost of the inventory item
    private String Supplier; // Supplier of the inventory item
}

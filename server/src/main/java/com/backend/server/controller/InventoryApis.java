package com.backend.server.controller; // Package declaration for the "controller" package under "com.backend.server"

import com.backend.server.Model.Inventory; // Import the Inventory model class
import com.backend.server.service.InventoryService; // Import the InventoryService class
import org.springframework.beans.factory.annotation.Autowired; // Import Spring annotation for dependency injection
import org.springframework.web.bind.annotation.*; // Import Spring Web annotations for controller and request mapping

import java.util.List; // Import Java utility class for List
import java.util.Optional; // Import Java utility class for Optional

@RestController // Indicates that this class is a REST controller
@RequestMapping("/inventory") // Base URL mapping for all endpoints in this controller
// See [Issue13] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/13)
public class InventoryApis {
    @Autowired // Enables automatic injection of an InventoryService bean
    InventoryService inventoryService;
    
    @PostMapping("/updateItem") // HTTP POST endpoint to update an inventory item
    Inventory updateItem(@RequestBody Inventory item){ // Request body contains the updated Inventory item
        return inventoryService.updateItem(item); // Call the InventoryService to update the item and return the updated item
    }
    // See [Issue11] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/11)
    @PostMapping("/addItem") // HTTP POST endpoint to add a new inventory item
    Inventory addItem(@RequestBody Inventory inventory){ // Request body contains the new Inventory item

        return inventoryService.addItem(inventory); // Call the InventoryService to add the item and return the added item
    }

    @GetMapping("/getItemById") // HTTP GET endpoint to retrieve an inventory item by its ID
    Optional<Inventory> getItemById(@RequestParam("itemId") int itemid){ // Request parameter "itemId" specifies the ID of the item to retrieve

        return inventoryService.getItemById(itemid); // Call the InventoryService to get the item by its ID and return it (or null if not found)
    }
    
}

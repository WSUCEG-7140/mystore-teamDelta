package com.backend.server.controller; // Package declaration for the "controller" package under "com.backend.server"

import com.backend.server.Model.Inventory; // Import the Inventory model class
import com.backend.server.service.InventoryService; // Import the InventoryService class
import org.springframework.beans.factory.annotation.Autowired; // Import Spring annotation for dependency injection
import org.springframework.web.bind.annotation.*; // Import Spring Web annotations for controller and request mapping

import java.util.List; // Import Java utility class for List
import java.util.Optional; // Import Java utility class for Optional

@RestController // Indicates that this class is a REST controller
@RequestMapping("/inventory") // Base URL mapping for all endpoints in this controller

/**
 * @class InventoryApis
 * @brief A class representing the APIs for Inventory service creation.
 *
 * @Autowired Enables automatic injection of an InventoryService bean.
 */
    
public class InventoryApis {
    @Autowired // Enables automatic injection of an InventoryService bean
    InventoryService inventoryService;

    /**
     * @brief Updates Inventory Items from the database.
     *
     * This method request the body contains the updated Inventory item.
     * @param item contains the updated information of the inventory item.
     * @pre The database connection must be established and valid.
     * @return the updated item by calling the InventoryService to update.
     * @post the HTTP POST endpoint to update an inventory item.
     * See [Issue13] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/13).
     */
    
    @PostMapping("/updateItem") 
    Inventory updateItem(@RequestBody Inventory item){ 
        return inventoryService.updateItem(item); 
    }

    /**
     * @brief Adds new Inventory Items to the database.
     *
     * This method request the body contains the new Inventory item.
     * @param inventory contains the new inventory item.
     * @pre The database connection must be established and valid.
     * @return the added item by calling the InventoryService to add the item.
     * @post the HTTP POST endpoint to add a new inventory item
     * See [Issue11] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/11)
     */
    
    @PostMapping("/addItem") 
    Inventory addItem(@RequestBody Inventory inventory){ 

        return inventoryService.addItem(inventory); 
    }

    /**
     * @brief Geeting Inventory Items based on their Ids.
     *
     * This method retries an inventory items based on its Ids.
     * @param itemId specifies the ID of the item to retrieve
     * @pre The database connection must be established and valid.
     * @return Inventory item by its ID or null if not found. 
     * @post the HTTP GET endpoint to retrieve an inventory item by its ID.
     * See [Issue11] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/11).
     */
    
    @GetMapping("/getItemById")
    Optional<Inventory> getItemById(@RequestParam("itemId") int itemid){

        return inventoryService.getItemById(itemid);
    }
    
}

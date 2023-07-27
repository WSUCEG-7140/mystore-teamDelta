package com.backend.server.service; // Package declaration for the "service" package under "com.backend.server"

import com.backend.server.Model.Inventory; // Import the Inventory model class

import java.util.List; // Import Java utility class for List
import java.util.Optional; // Import Java utility class for Optional

/**
     * @brief InventoryService interface defines the contract for the InventoryService.
     *
     * addItem Method signature for adding a new inventory item to the system.
     * The method takes an Inventory object as input and returns the added Inventory object.
     *
     * addAllItems Method signature for adding a list of inventory items to the system.
     * The method takes a List of Inventory objects as input and returns a list of added Inventory objects.
     *
     * updateItem Method signature for updating an existing inventory item in the system.
     * The method takes an Inventory object representing the updated item as input and returns the updated Inventory object.
     *
     * deleteItem Method signature for deleting an inventory item from the system based on its item ID.
     * The method takes the item ID (int) as input and returns a status message (String) indicating the success of the operation.
     * 
     * getItemById Method signature for retrieving an inventory item by its item ID.
     * The method takes the item ID (int) as input and returns an Optional containing the Inventory object if found, or an empty Optional if not found.
     *
     * getAllItems Method signature for retrieving all inventory items in the system.
     * The method returns a List of all Inventory objects present in the system.
     * See [Issue13] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/13)
     */

public interface InventoryService {
    Inventory addItem(Inventory inventory);

    List<Inventory>addAllItems(List<Inventory> inventories);

    Inventory updateItem(Inventory inventory);
    String deleteItem(int itemId);
    Optional<Inventory> getItemById(int itemId);
    List<Inventory> getAllItems();


}

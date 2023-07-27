package com.backend.server.service; // Package declaration for the "service" package under "com.backend.server"

import com.backend.server.Model.Inventory; // Import the Inventory model class
import com.backend.server.repository.InventoryRepository; // Import the InventoryRepository interface
import org.springframework.beans.factory.annotation.Autowired; // Import Spring annotation for dependency injection
import org.springframework.stereotype.Service; // Import Spring annotation for service

import java.util.List; // Import Java utility class for List
import java.util.Optional; // Import Java utility class for Optional

    /**
     * @class InventoryServiceImpl
     * @brief Service Indicates that this class is a Spring service
     * InventoryServiceImpl class implements the InventoryService interface and 
     * provides the implementation for inventory management.
     *
     */
@Service
public class InventoryServiceImpl implements InventoryService{
    @Autowired // Enables automatic injection of an InventoryRepository bean
    InventoryRepository inventoryRepository;
    @Override

    /**
     * @brief This addItem Method is to add a new inventory item to the system.
     * The method takes an Inventory object as input and returns the added Inventory object.
     *
     * @returns Save the new inventory item using the InventoryRepository and return the added item.
     * See [Issue13] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/13)
     */
    
    public Inventory addItem(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    @Override

    /**
     * @brief This addAllItems Method to add a list of inventory items to the system.
     * The method takes a List of Inventory objects as input and returns a list of added Inventory objects.
     * It Save all the inventory items in the list using the InventoryRepository.
     * @return the list of added inventory items (the input list itself, as it contains the added items).
     * See [Issue13] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/13)
     */
    
    public List<Inventory>addAllItems(List<Inventory> inventories){
        inventoryRepository.saveAll(inventories);
        return inventories;
    }
    @Override

    /**
     * @brief This updateItem Method to update an existing inventory item in the system.
     * The method takes an Inventory object representing the updated item as input and returns the updated Inventory object.
     * 
     * Save the updated inventory item using the InventoryRepository and return the updated item.
     * See [Issue13] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/13)
     */
    
    public Inventory updateItem(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    @Override

    /**
     * @brief This deleteItem Method to delete an inventory item from the system based on its item ID.
     * The method takes the item ID (int) as input and returns a status message (String) indicating the success of the operation.
     * 
     * Delete the inventory item with the specified item ID using the InventoryRepository.
     * @Return a success message indicating that the item was deleted successfully.
     * See [Issue13] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/13)
     */
    
    public String deleteItem(int itemId) {
        inventoryRepository.deleteById(itemId);
        return "Item Deleted Successfully";
    }

    @Override
    
    /**
     * @brief This getItemById Method to retrieve an inventory item by its item ID.
     * The method takes the item ID (int) as input and returns an Optional containing the Inventory object if found, 
     * or an empty Optional if not found.
     * 
     * Retrieve the inventory item with the specified item ID using the InventoryRepository and return it as an Optional.
     * See [Issue13] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/13)
     */
    
    public Optional<Inventory> getItemById(int itemId) {
        return inventoryRepository.findById(itemId);
    }

    @Override

    /**
     * @brief This getAllItems Method to retrieve all inventory items in the system.
     * The method returns a List of all Inventory objects present in the system. 
     * 
     * Retrieve all inventory items using the InventoryRepository and return them as a List.
     * See [Issue13] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/13)
     */
    
    public List<Inventory> getAllItems() {
        return inventoryRepository.findAll();
    }
}

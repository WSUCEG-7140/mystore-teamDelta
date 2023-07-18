package com.backend.server.service;

import com.backend.server.Model.Inventory;

import java.util.List;
import java.util.Optional;

public interface InventoryService {
    Inventory addItem(Inventory inventory);
    Inventory updateItem(Inventory inventory);
    String deleteItem(int itemId);
    Optional<Inventory> getItemById(int itemId);
    List<Inventory> getAllItems();


}

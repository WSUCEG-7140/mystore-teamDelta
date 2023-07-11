package com.backend.server.service;

import com.backend.server.Model.Inventory;

import java.util.List;
import java.util.Optional;

public interface InventoryService {
    Inventory addItem(Inventory inventory);
    List<Inventory> getAllItems();


}

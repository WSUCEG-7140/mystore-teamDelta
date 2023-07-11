package com.backend.server.service;

import com.backend.server.Model.Inventory;
import com.backend.server.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InventoryServiceImpl implements InventoryService{
    @Autowired
    InventoryRepository inventoryRepository;
    @Override
    public Inventory addItem(Inventory inventory) {    
        return inventoryRepository.save(inventory);
    }

    @Override
    public Inventory updateItem(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    @Override
    public List<Inventory> getAllItems() {
        return inventoryRepository.findAll();
    }

    @Override
    public Inventory addItem(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }
   

    @Override
    public Optional<Inventory> getItemById(int itemId) {
        return inventoryRepository.findById(itemId);
    }

   
}

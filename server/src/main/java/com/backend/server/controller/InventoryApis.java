package com.backend.server.controller;

import com.backend.server.Model.Inventory;
import com.backend.server.service.InventoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/inventory")
public class InventoryApis {
    @Autowired
    InventoryService inventoryService;
    
    @PostMapping("/updateItem")
    Inventory updateItem(@RequestBody Inventory item){
        return inventoryService.updateItem(item);
    }

    @PostMapping("/addItem")
    Inventory addItem(@RequestBody Inventory inventory){

        return inventoryService.addItem(inventory);
    }

    @GetMapping("/getItemById")
    Optional<Inventory> getItemById(@RequestParam("itemId") int itemid){

        return inventoryService.getItemById(itemid);
    }
    
}

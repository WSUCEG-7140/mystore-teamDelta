package com.backend.server.repository;

import com.backend.server.Model.Inventory;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
//Repository to store and make changes in db for Inventory table
@Repository
public interface InventoryRepository extends MongoRepository<Inventory,Integer> {
}

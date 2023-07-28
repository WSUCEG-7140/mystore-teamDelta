package com.backend.server.repository; // Package declaration for the "repository" package under "com.backend.server"

import com.backend.server.Model.Inventory; // Import the Inventory model class
import org.springframework.data.mongodb.repository.MongoRepository; // Import Spring Data MongoRepository
import org.springframework.stereotype.Repository; // Import Spring annotation for repository
//Repository to store and make changes in db for Inventory table
@Repository // Indicates that this interface is a Spring repository
public interface InventoryRepository extends MongoRepository<Inventory,Integer> {
  /** @brief The MongoRepository interface provides CRUD operations for the Inventory model
  * It is parameterized with <Inventory, Integer> where Inventory is the model class and Integer is the data type of the primary key (itemId in this case)
  * This interface does not require any additional methods since it inherits all the necessary CRUD operations from MongoRepository
  * See [Issue13] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/13)
  */
}

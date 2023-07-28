package com.backend.server.repository; // Package declaration for the "repository" package under "com.backend.server"

import com.backend.server.Model.Inventory; // Import the Inventory model class
import com.backend.server.Model.Payment; // Import the Payment model class
import org.springframework.data.mongodb.repository.MongoRepository; // Import Spring Data MongoRepository
import org.springframework.stereotype.Repository; // Import Spring annotation for repository

@Repository // Indicates that this interface is a Spring repository
/** 
  * @brief The MongoRepository interface provides CRUD operations for the Payment model
  *
  * It is parameterized with <Payment, String> where Payment is the model class and String is the data type of the primary key (paymentId in this case)
  * This interface does not require any additional methods since it inherits all the necessary CRUD operations from MongoRepository
  * See [Issue33] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/33)
  */
public interface PaymentRepository extends MongoRepository<Payment,String> {
}

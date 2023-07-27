package com.backend.server.repository; // Package declaration for the "repository" package under "com.backend.server"

import com.backend.server.Model.User; // Import the User model class
import org.springframework.data.mongodb.repository.MongoRepository; // Import Spring Data MongoRepository
import org.springframework.stereotype.Repository; // Import Spring annotation for repository

@Repository // Indicates that this interface is a Spring repository
/**
  * @brief The MongoRepository interface provides CRUD operations for the User model
  *
  * It is parameterized with <User, String> where User is the model class and String is the data type of the primary key (mobileNumber in this case)
  * This interface does not require any additional methods since it inherits all the necessary CRUD operations from MongoRepository
  * See [Issue13] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/13)
  */
public interface UserRepository extends MongoRepository<User,String> {
}

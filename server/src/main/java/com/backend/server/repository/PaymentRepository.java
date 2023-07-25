package com.backend.server.repository;

import com.backend.server.Model.Inventory;
import com.backend.server.Model.Payment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends MongoRepository<Payment,String> {
}

package com.backend.server.service; // Package declaration for the "service" package under "com.backend.server"

import com.backend.server.Model.Payment; // Import the Payment model class

/**
     * @brief This PaymentService interface defines the contract for the PaymentService.
     * <p>
     * addPayment Method signature for adding a new payment to the system.
     * The method takes a Payment object as input and returns the added Payment object.
     * The implementation of this method will handle the logic to add the payment to the system and persist it in the database.
     * See [Issue33] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/33)
     */

public interface PaymentService {
    public Payment addPayment(Payment payment);
}

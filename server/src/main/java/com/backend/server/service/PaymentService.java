package com.backend.server.service; // Package declaration for the "service" package under "com.backend.server"

import com.backend.server.Model.Payment; // Import the Payment model class

/**
 * @brief This PaymentService interface defines the contract for the PaymentService.
 * <p>
 * The PaymentService interface interface defines a contract that specifies 
 * the behavior of a service related to payment processing in the application.
 * 
 * The PaymentService interface declares a method called addPayment with a parameter payment of type Payment
 */

public interface PaymentService {
    
    /**
     * @brief This method define a contract for adding a new payment to the system.
     *
     * addPayment Method signature for adding a new payment to the system.
     * The implementation of this method will handle the logic to add the payment to the system and persist it in the database.
     * The purpose of this method is to define a contract for adding a new payment to the system.
     * @param payment parameter of the method, representing the new payment object to be added to the system
     * @returns the added payment object after addind it to the system.
     * See [Issue33] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/33)
     */
                      
    public Payment addPayment(Payment payment);
}

package com.backend.server.service; // Package declaration for the "service" package under "com.backend.server"

import com.backend.server.Model.Payment; // Import the Payment model class
import com.backend.server.repository.PaymentRepository; // Import the PaymentRepository interface
import org.springframework.beans.factory.annotation.Autowired; // Import Spring annotation for dependency injection
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; // Import Spring Security class for BCrypt password encoder
import org.springframework.stereotype.Service; // Import Spring annotation for service

import java.util.Optional; // Import Java utility class for Optional

/**
 * @class PaymentServiceImpl
 * @brief This class implements the PaymentService interface and provides the implementation for payment management.
 *
 * @Service Indicates that this class is a Spring service
 * @Autowired Enables automatic injection of a PaymentRepository bean
 */

@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    PaymentRepository paymentRepository;

    @Override

    /**
     * addPayment Method to add a new payment to the system.
     * The method takes a Payment object as input and returns the added Payment object.
     *
     * Save the new payment using the PaymentRepository.
     * @Return the added payment object.
     * See [Issue33] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/33)
     */
    
    public Payment addPayment(Payment payment) {
       paymentRepository.save(payment);
       return payment;
    }

}

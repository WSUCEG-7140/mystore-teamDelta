package com.backend.server.service;

import com.backend.server.Model.Payment;
import com.backend.server.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PaymentServiceImpl implements PaymentService{

    @Autowired
    PaymentRepository paymentRepository;


    @Override
    public Payment addPayment(Payment payment) {
       paymentRepository.save(payment);
       return payment;
    }

}

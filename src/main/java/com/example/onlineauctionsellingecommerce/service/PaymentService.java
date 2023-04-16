package com.example.onlineauctionsellingecommerce.service;

import com.example.onlineauctionsellingecommerce.model.PaymentModel;
import com.example.onlineauctionsellingecommerce.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;
    @Autowired
    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    public String pay(PaymentModel paymentModel){
        paymentModel.assemble(paymentRepository.save(paymentModel.disassemble()));
        return "payment Done";
    }
}

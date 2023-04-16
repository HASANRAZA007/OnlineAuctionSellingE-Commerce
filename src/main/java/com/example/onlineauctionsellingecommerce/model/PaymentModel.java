package com.example.onlineauctionsellingecommerce.model;
import com.example.onlineauctionsellingecommerce.entity.Order;
import com.example.onlineauctionsellingecommerce.entity.Payment;
import com.example.onlineauctionsellingecommerce.entity.User;
import lombok.Data;

@Data
public class PaymentModel {
    private boolean status;
    private User user;
    private Order order;

    public Payment disassemble() {
        Payment payment = new Payment();
        payment.setStatus(status);
        payment.setUser(user);
        payment.setOrder(order);
        return payment;
    }

    public PaymentModel assemble(Payment payment) {
        PaymentModel paymentModel = new PaymentModel();
        paymentModel.setStatus(payment.isStatus());
        paymentModel.setOrder(payment.getOrder());
        paymentModel.setUser(payment.getUser());
        return paymentModel;
    }
}

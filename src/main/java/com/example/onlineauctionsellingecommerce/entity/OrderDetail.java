package com.example.onlineauctionsellingecommerce.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "order_detail")
@Data
public class OrderDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int orderDetailId;
    @Column(name = "item_quantity")
    private int OrderQuantity;
    @Column(name = "total_amount")
    private float totalAmount;
    @Column(name = "payment_method")
    private String paymentMethod;
    @Column(name = "order_date")
    private java.time.LocalDateTime orderDate;
    @Column(name = "shipping_address")
    private String shippingAddress;
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Order orders;
    @ManyToOne
    @JoinColumn(name = "buyer_id")
    private Buyer buyer;
}

package com.example.onlineauctionsellingecommerce.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "order_item")
@Data
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "date")
    private java.time.LocalDateTime date;
    @Column(name = "shipping_address")
    private String shippingAddress;
    @Column(name = "amount")
    private Float amount;
    @Column(name = "payment_method")
    private String paymentMethod;
    @ManyToOne
    @JoinColumn(name = "item_id")
    private Item item;
    @OneToOne(mappedBy = "order")
    private Payment payment;
    @ManyToOne
    @JoinColumn(name = "buyer")
    private User user;

}

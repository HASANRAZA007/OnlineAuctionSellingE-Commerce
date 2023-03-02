package com.example.onlineauctionsellingecommerce.entity;
import jakarta.persistence.*;
import lombok.Data;

@Entity(name = "product")
@Data
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long product_id;
    @Column(name = "product_title")
    private String product_title;
    @Column(name = "product_name")
    private String product_name;
    @Column(name = "product_description")
    private String product_description;
    @Column(name = "product_condition")
    private String product_condition;
    @Column(name = "produc_price")
    private float product_price;
    @Column(name = "product_category")
    private String product_category;
    @Column(name = "devlivery_date")
    private String delivery_date;
    @Column(name = "shipment_charges")
    private float shipment_charges;
    @Column(name = "seller_id")
    private long seller_id;

}


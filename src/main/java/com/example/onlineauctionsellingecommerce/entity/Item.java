package com.example.onlineauctionsellingecommerce.entity;
import jakarta.persistence.*;
import lombok.Data;
import lombok.ToString;
import java.util.List;

@Entity
@Table(name = "item")
@Data
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "item_id")
    private long itemId;
    @Column(name = "item_title")
    private String itemTitle;
    @Column(name = "item_name")
    private String itemName;
    @Column(name = "item_description")
    private String itemDescription;
    @Column(name = "item_condition")
    private String itemCondition;
    @Column(name = "item_price")
    private float itemPrice;
    @ManyToOne
    @JoinColumn(name = "seller_id")
    private Seller sellers;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category categories;
    @OneToMany(mappedBy = "item")
    private List<BidItem> sellerBidItem;
    @OneToMany(mappedBy = "item")
    private List<Order> orderItem;

}


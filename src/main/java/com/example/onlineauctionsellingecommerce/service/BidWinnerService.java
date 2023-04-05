package com.example.onlineauctionsellingecommerce.service;
import com.example.onlineauctionsellingecommerce.repository.BidItemRepository;
import org.springframework.stereotype.Service;

@Service
public class BidWinnerService {
    private final BidItemRepository bidItemRepository;

    public BidWinnerService(BidItemRepository bidItemRepository) {
        this.bidItemRepository = bidItemRepository;
    }

}

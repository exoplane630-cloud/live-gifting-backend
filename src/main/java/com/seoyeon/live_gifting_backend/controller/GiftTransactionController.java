package com.seoyeon.live_gifting_backend.controller;

import com.seoyeon.live_gifting_backend.entity.GiftTransaction;
import com.seoyeon.live_gifting_backend.service.GiftTransactionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GiftTransactionController {

    private final GiftTransactionService giftTransactionService;

    public GiftTransactionController(GiftTransactionService giftTransactionService) {
        this.giftTransactionService = giftTransactionService;
    }

    @GetMapping("/transactions")
    public List<GiftTransaction> getAllTransactions() {
        return giftTransactionService.getAllTransactions();
    }

    @GetMapping("/streamers/{id}/history")
    public List<GiftTransaction> getTransactionsByStreamer(@PathVariable Long id) {
        return giftTransactionService.getTransactionsByStreamerId(id);
    }
}
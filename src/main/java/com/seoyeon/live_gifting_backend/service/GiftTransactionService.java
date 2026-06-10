package com.seoyeon.live_gifting_backend.service;

import com.seoyeon.live_gifting_backend.entity.GiftTransaction;
import com.seoyeon.live_gifting_backend.repository.GiftTransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GiftTransactionService {

    private final GiftTransactionRepository giftTransactionRepository;

    public GiftTransactionService(GiftTransactionRepository giftTransactionRepository) {
        this.giftTransactionRepository = giftTransactionRepository;
    }

    public List<GiftTransaction> getAllTransactions() {
        return giftTransactionRepository.findAll();
    }

    public List<GiftTransaction> getTransactionsByStreamerId(Long streamerId) {
        return giftTransactionRepository.findByStreamerId(streamerId);
    }
}
package com.seoyeon.live_gifting_backend.service;

import com.seoyeon.live_gifting_backend.dto.StatisticsResponse;
import com.seoyeon.live_gifting_backend.repository.GiftRepository;
import com.seoyeon.live_gifting_backend.repository.StreamerRepository;
import org.springframework.stereotype.Service;

@Service
public class StatisticsService {

    private final StreamerRepository streamerRepository;
    private final GiftRepository giftRepository;

    public StatisticsService(StreamerRepository streamerRepository, GiftRepository giftRepository) {
        this.streamerRepository = streamerRepository;
        this.giftRepository = giftRepository;
    }

    public StatisticsResponse getStatistics() {
        long totalStreamers = streamerRepository.count();
        long totalGifts = giftRepository.count();

        int totalCoins = giftRepository.findAll()
                .stream()
                .mapToInt(gift -> gift.getCoins())
                .sum();

        return new StatisticsResponse(totalStreamers, totalGifts, totalCoins);
    }
}
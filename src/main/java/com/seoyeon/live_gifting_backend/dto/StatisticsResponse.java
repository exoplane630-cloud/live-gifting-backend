package com.seoyeon.live_gifting_backend.dto;

public class StatisticsResponse {

    private long totalStreamers;
    private long totalGifts;
    private int totalCoins;

    public StatisticsResponse(long totalStreamers, long totalGifts, int totalCoins) {
        this.totalStreamers = totalStreamers;
        this.totalGifts = totalGifts;
        this.totalCoins = totalCoins;
    }

    public long getTotalStreamers() {
        return totalStreamers;
    }

    public long getTotalGifts() {
        return totalGifts;
    }

    public int getTotalCoins() {
        return totalCoins;
    }
}
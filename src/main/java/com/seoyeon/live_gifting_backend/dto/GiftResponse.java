package com.seoyeon.live_gifting_backend.dto;

public class GiftResponse {

    private Long id;
    private String sender;
    private int coins;
    private Long streamerId;

    public GiftResponse(Long id, String sender, int coins, Long streamerId) {
        this.id = id;
        this.sender = sender;
        this.coins = coins;
        this.streamerId = streamerId;
    }

    public Long getId() {
        return id;
    }

    public String getSender() {
        return sender;
    }

    public int getCoins() {
        return coins;
    }

    public Long getStreamerId() {
        return streamerId;
    }
}
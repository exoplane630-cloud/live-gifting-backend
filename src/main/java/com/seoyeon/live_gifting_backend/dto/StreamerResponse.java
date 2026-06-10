package com.seoyeon.live_gifting_backend.dto;

public class StreamerResponse {

    private Long id;
    private String name;
    private int totalCoins;

    public StreamerResponse(Long id, String name, int totalCoins) {
        this.id = id;
        this.name = name;
        this.totalCoins = totalCoins;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTotalCoins() {
        return totalCoins;
    }
}
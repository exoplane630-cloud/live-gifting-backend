package com.seoyeon.live_gifting_backend.dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class SendGiftRequest {

    @NotBlank(message = "Sender cannot be empty")
    private String sender;

    @Min(value = 1, message = "Coins must be at least 1")
    private int coins;

    public SendGiftRequest() {}

    public String getSender() {
        return sender;
    }

    public int getCoins() {
        return coins;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }
}
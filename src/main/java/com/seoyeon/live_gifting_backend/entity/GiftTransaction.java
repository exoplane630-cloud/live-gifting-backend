package com.seoyeon.live_gifting_backend.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class GiftTransaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sender;

    private int coins;

    private LocalDateTime sentAt;

    @ManyToOne
    @JoinColumn(name = "streamer_id")
    private Streamer streamer;

    public GiftTransaction() {
    }

    public GiftTransaction(String sender, int coins, Streamer streamer) {
        this.sender = sender;
        this.coins = coins;
        this.streamer = streamer;
        this.sentAt = LocalDateTime.now();
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

    public LocalDateTime getSentAt() {
        return sentAt;
    }

    public Streamer getStreamer() {
        return streamer;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setCoins(int coins) {
        this.coins = coins;
    }

    public void setSentAt(LocalDateTime sentAt) {
        this.sentAt = sentAt;
    }

    public void setStreamer(Streamer streamer) {
        this.streamer = streamer;
    }
}
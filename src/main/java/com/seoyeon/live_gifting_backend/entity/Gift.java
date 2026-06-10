package com.seoyeon.live_gifting_backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Gift {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String sender;
    private int coins;

    @ManyToOne
    private Streamer streamer;

    public Gift() {
    }

    public Gift(Long id, String sender, int coins) {
        this.id = id;
        this.sender = sender;
        this.coins = coins;
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

    public void setStreamer(Streamer streamer) {
        this.streamer = streamer;
    }
}




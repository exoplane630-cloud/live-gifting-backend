package com.seoyeon.live_gifting_backend.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Streamer {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private int totalCoins;

    public Streamer() {
    }

    public Streamer(String name) {
        this.name = name;
        this.totalCoins = 0;
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

    public void setName(String name) {
        this.name = name;
    }

    public void setTotalCoins(int totalCoins) {
        this.totalCoins = totalCoins;
    }

    public void addCoins(int coins) {
        this.totalCoins += coins;
    }
}
package com.seoyeon.live_gifting_backend.dto;

import jakarta.validation.constraints.NotBlank;

public class CreateStreamerRequest {

    @NotBlank(message = "Streamer name cannot be empty")
    private String name;

    public CreateStreamerRequest() {}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
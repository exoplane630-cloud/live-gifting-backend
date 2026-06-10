package com.seoyeon.live_gifting_backend.exception;

public class StreamerNotFoundException extends RuntimeException {

    public StreamerNotFoundException(Long id) {
        super("Streamer not found with id: " + id);
    }
}
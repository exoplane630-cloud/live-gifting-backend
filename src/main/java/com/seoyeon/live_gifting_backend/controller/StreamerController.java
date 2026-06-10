package com.seoyeon.live_gifting_backend.controller;

import com.seoyeon.live_gifting_backend.dto.CreateStreamerRequest;
import com.seoyeon.live_gifting_backend.dto.StreamerResponse;
import com.seoyeon.live_gifting_backend.service.StreamerService;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/streamers")
public class StreamerController {

    private final StreamerService streamerService;

    public StreamerController(StreamerService streamerService) {
        this.streamerService = streamerService;
    }

    @PostMapping
    public StreamerResponse createStreamer(@Valid @RequestBody CreateStreamerRequest request) {
        return streamerService.createStreamer(request);
    }

    @GetMapping
    public List<StreamerResponse> getAllStreamers() {
        return streamerService.getAllStreamers();
    }

    @GetMapping("/{id}")
    public StreamerResponse getStreamer(@PathVariable Long id) {
        return streamerService.getStreamer(id);
    }

    @DeleteMapping("/{id}")
    public void deleteStreamer(@PathVariable Long id) {
        streamerService.deleteStreamer(id);
    }

    @GetMapping("/leaderboard")
    public List<StreamerResponse> getLeaderboard() {
        return streamerService.getLeaderboard();
    }
}
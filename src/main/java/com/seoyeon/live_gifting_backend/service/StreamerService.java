package com.seoyeon.live_gifting_backend.service;

import com.seoyeon.live_gifting_backend.dto.CreateStreamerRequest;
import com.seoyeon.live_gifting_backend.dto.StreamerResponse;
import com.seoyeon.live_gifting_backend.entity.Streamer;
import com.seoyeon.live_gifting_backend.exception.StreamerNotFoundException;
import com.seoyeon.live_gifting_backend.repository.StreamerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StreamerService {

    private final StreamerRepository streamerRepository;

    public StreamerService(StreamerRepository streamerRepository) {
        this.streamerRepository = streamerRepository;
    }

    public StreamerResponse createStreamer(CreateStreamerRequest request) {
        Streamer streamer = new Streamer(request.getName());
        Streamer savedStreamer = streamerRepository.save(streamer);

        return new StreamerResponse(
                savedStreamer.getId(),
                savedStreamer.getName(),
                savedStreamer.getTotalCoins()
        );
    }

    public List<StreamerResponse> getAllStreamers() {
        return streamerRepository.findAll()
                .stream()
                .map(streamer -> new StreamerResponse(
                        streamer.getId(),
                        streamer.getName(),
                        streamer.getTotalCoins()
                ))
                .toList();
    }

    public StreamerResponse getStreamer(Long id) {
        Streamer streamer = streamerRepository.findById(id)
                .orElseThrow(() -> new StreamerNotFoundException(id));

        return new StreamerResponse(
                streamer.getId(),
                streamer.getName(),
                streamer.getTotalCoins()
        );
    }

    public void deleteStreamer(Long id) {
        streamerRepository.deleteById(id);
    }

    public List<StreamerResponse> getLeaderboard() {
        return streamerRepository.findAllByOrderByTotalCoinsDesc()
                .stream()
                .map(streamer -> new StreamerResponse(
                        streamer.getId(),
                        streamer.getName(),
                        streamer.getTotalCoins()
                ))
                .toList();
    }
}
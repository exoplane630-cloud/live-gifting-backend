package com.seoyeon.live_gifting_backend.service;

import com.seoyeon.live_gifting_backend.entity.Gift;
import com.seoyeon.live_gifting_backend.repository.GiftRepository;
import org.springframework.stereotype.Service;
import com.seoyeon.live_gifting_backend.entity.Streamer;
import com.seoyeon.live_gifting_backend.repository.StreamerRepository;
import java.util.List;
import com.seoyeon.live_gifting_backend.exception.GiftNotFoundException;
import com.seoyeon.live_gifting_backend.exception.StreamerNotFoundException;
import com.seoyeon.live_gifting_backend.dto.SendGiftRequest;
import com.seoyeon.live_gifting_backend.dto.GiftResponse;

@Service
public class GiftService {

    private final GiftRepository giftRepository;
    private final StreamerRepository streamerRepository;

    public GiftService(GiftRepository giftRepository, StreamerRepository streamerRepository) {
        this.giftRepository = giftRepository;
        this.streamerRepository = streamerRepository;

    }

    public Gift createGift(Gift gift) {
        return giftRepository.save(gift);
    }

    public List<Gift> getAllGifts() {
        return giftRepository.findAll();
    }

    public Gift getGiftById(Long id) {
        return giftRepository.findById(id)
                .orElseThrow(() -> new GiftNotFoundException(id));
    }

    public Gift updateGift(Long id, Gift newGift) {
        Gift gift = giftRepository.findById(id).orElse(null);

        if (gift == null) {
            return null;
        }

        gift.setSender(newGift.getSender());
        gift.setCoins(newGift.getCoins());

        return giftRepository.save(gift);
    }

    public void deleteGift(Long id) {
        giftRepository.deleteById(id);
    }

    public GiftResponse sendGiftToStreamer(Long streamerId, SendGiftRequest request) {
        Streamer streamer = streamerRepository.findById(streamerId)
                .orElseThrow(() -> new StreamerNotFoundException(streamerId));

        Gift gift = new Gift();
        gift.setSender(request.getSender());
        gift.setCoins(request.getCoins());
        gift.setStreamer(streamer);

        streamer.addCoins(request.getCoins());
        streamerRepository.save(streamer);

        Gift savedGift = giftRepository.save(gift);

        return new GiftResponse(
                savedGift.getId(),
                savedGift.getSender(),
                savedGift.getCoins(),
                savedGift.getStreamer().getId()
        );
    }

    public List<Gift> getGiftsByStreamer(Long streamerId) {
        return giftRepository.findByStreamerId(streamerId);
    }

    public Gift getTopGift() {
        return giftRepository.findTopByOrderByCoinsDesc();
    }

}
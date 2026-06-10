package com.seoyeon.live_gifting_backend.controller;

import com.seoyeon.live_gifting_backend.entity.Gift;
import com.seoyeon.live_gifting_backend.service.GiftService;
import org.springframework.web.bind.annotation.*;
import com.seoyeon.live_gifting_backend.dto.SendGiftRequest;
import com.seoyeon.live_gifting_backend.dto.GiftResponse;
import jakarta.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/gifts")
public class GiftController {

    private final GiftService giftService;

    public GiftController(GiftService giftService) {
        this.giftService = giftService;
    }

    @PostMapping
    public Gift createGift(@RequestBody Gift gift) {
        return giftService.createGift(gift);
    }

    @GetMapping
    public List<Gift> getAllGifts() {
        return giftService.getAllGifts();
    }

    @GetMapping("/streamers/{streamerId}")
    public List<Gift> getGiftsByStreamer(@PathVariable Long streamerId) {
        return giftService.getGiftsByStreamer(streamerId);
    }

    @GetMapping("/top")
    public Gift getTopGift() {
        return giftService.getTopGift();
    }

    @GetMapping("/{id}")
    public Gift getGiftById(@PathVariable Long id) {
        return giftService.getGiftById(id);
    }

    @PutMapping("/{id}")
    public Gift updateGift(@PathVariable Long id, @RequestBody Gift gift) {
        return giftService.updateGift(id, gift);
    }

    @DeleteMapping("/{id}")
    public void deleteGift(@PathVariable Long id) {
        giftService.deleteGift(id);
    }

    @PostMapping("/streamers/{streamerId}")
    public GiftResponse sendGiftToStreamer(
            @PathVariable Long streamerId,
            @Valid @RequestBody SendGiftRequest request) {
        return giftService.sendGiftToStreamer(streamerId, request);
    }

}
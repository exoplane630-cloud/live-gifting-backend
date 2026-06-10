package com.seoyeon.live_gifting_backend.repository;

import com.seoyeon.live_gifting_backend.entity.Gift;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GiftRepository extends JpaRepository<Gift, Long> {

    List<Gift> findByStreamerId(Long streamerId);
    Gift findTopByOrderByCoinsDesc();
}
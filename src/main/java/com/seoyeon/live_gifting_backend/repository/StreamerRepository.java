package com.seoyeon.live_gifting_backend.repository;

import com.seoyeon.live_gifting_backend.entity.Streamer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StreamerRepository extends JpaRepository<Streamer, Long> {

    List<Streamer> findAllByOrderByTotalCoinsDesc();
}
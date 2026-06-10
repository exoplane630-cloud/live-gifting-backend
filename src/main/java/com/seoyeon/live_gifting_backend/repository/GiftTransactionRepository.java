package com.seoyeon.live_gifting_backend.repository;

import com.seoyeon.live_gifting_backend.entity.GiftTransaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GiftTransactionRepository extends JpaRepository<GiftTransaction, Long> {

    List<GiftTransaction> findByStreamerId(Long streamerId);
}
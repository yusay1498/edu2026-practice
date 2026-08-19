/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.domain.repository;

import com.example.domain.entity.CardDetail;
import com.example.domain.entity.Card;

import java.util.List;
import java.util.Optional;

public interface CardRepository {

    Optional<Card> findById(int id);
    CardDetail findDetailById(int id);
    List<Card> findAll();
    Card save(Card card);
    int delete(int id);

}

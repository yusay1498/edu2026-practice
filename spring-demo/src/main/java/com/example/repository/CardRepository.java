/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.repository;

import com.example.dto.CardDetail;
import com.example.entity.card.Card;

import java.util.List;

public interface CardRepository {

    Card findById(int id);
    CardDetail findDetailById(int id);
    List<Card> findAll();
    int insert(Card card);
    int update(Card card);
    int delete(int id);

}

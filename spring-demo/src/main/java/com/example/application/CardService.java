/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.application;

import com.example.domain.entity.CardDetail;
import com.example.domain.entity.Card;
import java.util.List;

public interface CardService {

    Card findById(int id);
    CardDetail findDetailById(int id);
    List<Card> findAll();
    int insert(Card card);
    int update(Card card);
    int delete(int id);

}

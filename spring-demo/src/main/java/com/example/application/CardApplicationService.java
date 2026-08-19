/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.application;

import com.example.domain.ResourceNotFoundException;
import com.example.domain.entity.CardDetail;
import com.example.domain.entity.Card;
import com.example.domain.repository.CardRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CardApplicationService {

    private final CardRepository repository;

    public CardApplicationService(CardRepository repository) {
        this.repository = repository;
    }

    public Card lookup(int id) {
        return repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Card not found"));
    }

    public CardDetail lookupDetail(int id) {
        CardDetail detail = lookupDetail(id);

        if (detail == null) {
            throw new ResourceNotFoundException("Card detail not found");
        }
        return detail;
    }

    public List<Card> list() {
        return repository.findAll();

    }

    public Card insert(Card card) {
        return  repository.save(card);
    }

    public Card update(Card card) {
        return repository.save(card);
    }

    public int delete(int id) {
        int result = repository.delete(id);

        if (result != 1) {
            throw new ResourceNotFoundException("Delete failed");
        }
        return result;
    }
}

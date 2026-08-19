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
public class CardServiceImpl implements CardService {

    private final CardRepository repository;

    public CardServiceImpl(@Qualifier("cardRepositoryMockImpl") CardRepository repository) {
        // 本番用 Repositoryの @Repository("cardRepositoryImpl"),
        // Service の @Qualifier("cardRepositoryImpl"),
        // テストコードの @Qualifier("cardRepositoryImpl"),
        // テストコードの @MockitoBean(name = "cardRepositoryImpl") を揃える必要がある
        this.repository = repository;
    }

    @Override
    public Card findById(int id) {
        Card card = repository.findById(id);

        if (card == null) {
            throw new ResourceNotFoundException("Card not found");
        }
        return card;
    }

    @Override
    public CardDetail findDetailById(int id) {
        CardDetail detail = findDetailById(id);

        if (detail == null) {
            throw new ResourceNotFoundException("Card detail not found");
        }
        return detail;
    }

    @Override
    public List<Card> findAll() {
        return repository.findAll();

    }

    @Override
    public int insert(Card card) {
        int result = repository.insert(card);

        if (result != 1) {
            throw new ResourceNotFoundException("Insert failed");
        }
        return result;
    }

    @Override
    public int update(Card card) {
        int result = repository.update(card);

        if (result != 1) {
            throw new ResourceNotFoundException("Update failed");
        }
        return result;
    }

    @Override
    public int delete(int id) {
        int result = repository.delete(id);

        if (result != 1) {
            throw new ResourceNotFoundException("Delete failed");
        }
        return result;
    }
}

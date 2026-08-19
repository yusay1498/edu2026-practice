/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.service;

import com.example.common.ResourceNotFoundException;
import com.example.dto.CardDetail;
import com.example.entity.card.Card;
import com.example.repository.CardRepository;
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
        // TO DO : RepositoryのfindById()を実行
        return null; // TO DO : あとで削除

//        if (card == null) {
//            throw new ResourceNotFoundException("Card not found");
//        }
//        return card;
    }

    @Override
    public CardDetail findDetailById(int id) {
        // TO DO : RepositoryのfindDetailById()を実行
        return null; // TO DO : あとで削除

//        if (detail == null) {
//            throw new ResourceNotFoundException("Card detail not found");
//        }
//        return detail;
    }

    @Override
    public List<Card> findAll() {
        // TO DO : RepositoryのfindAll()を実行
        return null; // TO DO : あとで削除

    }

    @Override
    public int insert(Card card) {
        // TO DO : Repositoryのinsert()を実行
        return 0; // TO DO : あとで削除

//        if (result != 1) {
//            throw new ResourceNotFoundException("Insert failed");
//        }
//        return result;
    }

    @Override
    public int update(Card card) {
        // TO DO : Repositoryのupdate()を実行
        return 0; // TO DO : あとで削除

//        if (result != 1) {
//            throw new ResourceNotFoundException("Update failed");
//        }
//        return result;
    }

    @Override
    public int delete(int id) {
        // TO DO : Repositoryのupdate()を実行
        return 0; // TO DO : あとで削除

//        if (result != 1) {
//            throw new ResourceNotFoundException("Delete failed");
//        }
//        return result;
    }
}

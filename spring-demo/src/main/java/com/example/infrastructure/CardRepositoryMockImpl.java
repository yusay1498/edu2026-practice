/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.infrastructure;

import com.example.domain.repository.CardRepository;
import com.example.domain.entity.CardDetail;
import com.example.domain.entity.Card;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("cardRepositoryMockImpl")
public class CardRepositoryMockImpl implements CardRepository {

    private static final List<Card> MOCK_CARDS = List.of(
            new Card(1, "Geezard_Mock", 1, null, 1, 4, 1, 5),
            new Card(2, "Funguar_Mock", 1, null, 3, 1, 1, 3),
            new Card(3, "Bite Bug_Mock", 1, null, 1, 3, 3, 2),
            new Card(4, "Red Bat_Mock", 1, null, 2, 1, 4, 3),
            new Card(5, "Blobra_Mock", 2, null, 2, 3, 1, 5),
            new Card(6, "Gayla_Mock", 2, null, 5, 2, 1, 4),
            new Card(7, "Gesper_Mock", 2, null, 1, 5, 4, 1),
            new Card(8, "Fastitocalon-F_Mock", 2, 1, 3, 5, 2, 1),
            new Card(9, "Blood Soul_Mock", 2, null, 4, 2, 1, 5),
            new Card(10, "Cockatrice_Mock", 2, 2, 2, 4, 5, 1)
    );

    @Override
    public Card findById(int id) {
        return MOCK_CARDS.stream()
                .filter(card -> card.id().equals(id))
                .findFirst() // Optional<Card>を返す
                .orElse(null); // 見つかっていれば、Optional<Card>からCardを取り出して返す
        // 見つかっていなければ、nullを返す
        // → 最終的にはOptionalでない型で返したい
    }

    @Override
    public CardDetail findDetailById(int id) {
        // JOIN の結果を模した固定値を返す
        if (id <= 10) {
            return new CardDetail(
                    id,
                    "Geezard_Mock",
                    1,
                    1,  // elementId
                    "Fire",     // elementName
                    1, 4, 1, 5
            );
        } else {
            return null;// 見つからない場合は null → Service 層で例外化する
        }
    }

    @Override
    public List<Card> findAll() {
        return MOCK_CARDS;
    }

    @Override
    public int insert(Card card) {
        // 挿入したつもりで成功値をそのまま返す
        return 1;
    }

    @Override
    public int update(Card card) {
        // 更新したつもりで成功値をそのまま返す
        return 1;

    }

    @Override
    public int delete(int id) {
        // 削除したつもりで成功値をそのまま返す
        return 1;
    }

}

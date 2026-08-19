/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.repository;

import com.example.dto.CardDetail;
import com.example.entity.card.Card;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("cardRepositoryImpl")
// 本番用 Repositoryの @Repository("cardRepositoryImpl"),
// Service の @Qualifier("cardRepositoryImpl"),
// テストコードの @Qualifier("cardRepositoryImpl"),
// テストコードの @MockitoBean(name = "cardRepositoryImpl") を揃える必要がある
public class CardRepositoryImpl implements CardRepository {

    private final JdbcClient jdbcClient;

    public CardRepositoryImpl(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    @Override
    public Card findById(int id) {
        return jdbcClient.sql("""
                // TO DO : SQL記述
                
                """)
                .param("id", id)    // SQLの :id(プレースホルダ)に変数idの内容を埋め込む
                .query(Card.class)       // SQL実行結果をCardクラスに自動変換する
                .optional()              //Optional<CardDetail>を返す
                .orElse(null);     // → 結果が1件ならCardを取り出して返す
                                        //        0件なら nullを返す → Service 層で例外化
    }

    @Override
    public CardDetail findDetailById(int id) {
        return jdbcClient.sql("""
                // TO DO : SQL記述
                
                """)
                .param("id", id)    // SQLの :id(プレースホルダ)に変数idの内容を埋め込む
                .query(CardDetail.class) // SQL実行結果をCardDetailクラスに自動変換する
                .optional()              //Optional<CardDetail>を返す
                .orElse(null);     // → 結果が1件ならCardDetailを取り出して返す
                                        //        0件なら nullを返す → Service 層で例外化
    }

    @Override
    public List<Card> findAll() {
        return jdbcClient.sql("""
                // TO DO : SQL記述
                
                """)
                .query(Card.class)
                .list();    // SQL実行結果の複数行を、query()で指定したクラスのリスト
                            // (ここではList<Card>)にして返す
    }

    @Override
    public int insert(Card card) {
        return jdbcClient.sql("""
            // TO DO : SQL記述
            
            """)
                // TO DO : 各カラムについてパラメータ置換
                //.param(...)







                .update();
                // update() : 変更系 SQL(INSERT/UPDATE/DELETE)を実行し、影響を受けた行数を返す。
                // 主キー重複などでINSERTが失敗したら例外が投げられ、戻り値は返らない。
    }

    @Override
    public int update(Card card) {
        return jdbcClient.sql("""
            // TO DO : SQL記述
            
            
            """)
                // TO DO : 各カラムについてパラメータ置換
                //.param(...)







                .update();
            // update() : 変更系 SQL(INSERT/UPDATE/DELETE)を実行し、影響を受けた行数を返す。
            // 主キー重複などでINSERTが失敗したら例外が投げられ、戻り値は返らない。
    }

    @Override
    public int delete(int id) {
        return jdbcClient.sql("""
            // TO DO : SQL記述
            
            """)
                // TO DO : パラメータ置換
                // .param(...)
                .update();
        // update() : 変更系 SQL(INSERT/UPDATE/DELETE)を実行し、影響を受けた行数を返す。
        // 主キー重複などでINSERTが失敗したら例外が投げられ、戻り値は返らない。
    }
}
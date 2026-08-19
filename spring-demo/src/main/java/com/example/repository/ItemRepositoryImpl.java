/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.repository;

import com.example.entity.card.Card;
import com.example.entity.item.Item;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository("itemRepositoryImpl")
// 本番用 Repositoryの @Repository("itemRepositoryImpl"),
// Service の @Qualifier("itemRepositoryImpl"),
// テストコードの @Qualifier("itemRepositoryImpl"),
// テストコードの @MockitoBean(name = "itemRepositoryImpl") を揃える必要がある
public class ItemRepositoryImpl implements ItemRepository {

    private final JdbcClient jdbcClient;

    public ItemRepositoryImpl(JdbcClient jdbcClient) {
        this.jdbcClient = jdbcClient;
    }

    @Override
    public Item findById(int id) {
        return jdbcClient.sql("""
                // TO DO : SQL記述

                """)
                .param("id", id)   // SQLの :id(プレースホルダ)に変数idの内容を埋め込む
                .query(Item.class)      // SQL実行結果をItemクラスに自動変換する
                .optional()             //Optional<Item>を返す
                .orElse(null);     // → 結果が1件ならItemを取り出して返す
                                        // 0件なら null → Service 層で例外化
    }

    @Override
    public List<Item> findAll() {
        return jdbcClient.sql("""
                 // TO DO : SQL記述
                 
                """)
                .query(Item.class)
                .list();    // SQL実行結果の複数行を、query()で指定したクラスのリスト
                            // (ここではList<Item>)にして返す
    }

    @Override
    public int insert(Item item) {
        return jdbcClient.sql("""
                 // TO DO : SQL記述
                 
                """)
                .param("id", item.id())
                .param("name", item.name())
                // TO DO : price, sellPriceについて同様にパラメータ置換

                .update();
                // update() : 変更系 SQL(INSERT/UPDATE/DELETE)を実行し、影響を受けた行数を返す。
                // 主キー重複などでINSERTが失敗したら例外が投げられ、戻り値は返らない。
    }

    @Override
    public int update(Item item) {
        return jdbcClient.sql("""
                // TO DO : SQL記述
                
                """)
                .param("id", item.id())
                .param("name", item.name())
                // TO DO : price, sellPriceについて同様にパラメータ置換

                .update();
                // update() : 変更系 SQL(INSERT/UPDATE/DELETE)を実行し、影響を受けた行数を返す。
                // 主キー重複などでINSERTが失敗したら例外が投げられ、戻り値は返らない。
    }

    @Override
    public int delete(int id) {
        return jdbcClient.sql("""
               // TO DO : SQL記述
               
                """)
                // TO DO : idについてパラメータ置換
                .update();
            // update() : 変更系 SQL(INSERT/UPDATE/DELETE)を実行し、影響を受けた行数を返す。
            // 主キー重複などでINSERTが失敗したら例外が投げられ、戻り値は返らない。
    }
}

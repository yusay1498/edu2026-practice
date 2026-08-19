/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.repository;

import com.example.entity.item.Item;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("itemRepositoryMockImpl")
public class ItemRepositoryMockImpl implements ItemRepository {

    @Override
    public Item findById(int id) {
        // 固定値返却（DBアクセスの代わり）
        return null; // TO DO : 下行に置き換え
        //return new Item(id, "Potion_Mock", 100, 50);
    }

    @Override
    public List<Item> findAll() {
        // 固定値返却（DBアクセスの代わり）
        return null; // TO DO : 下行に置き換え
//        return List.of(
//                new Item(1,  "Potion_Mock",        100,   50),
//                new Item(2,  "Hi-Potion_Mock",     300,  150),
//                new Item(3,  "Ether_Mock",         500,  250),
//                new Item(4,  "Elixir_Mock",       5000, 2500),
//                new Item(5,  "Antidote_Mock",       80,   40),
//                new Item(6,  "Phoenix Down_Mock", 1000,  500),
//                new Item(7,  "Remedy_Mock",        700,  350),
//                new Item(8,  "Mega-Potion_Mock",   800,  400),
//                new Item(9,  "Turbo Ether_Mock",  1500,  750),
//                new Item(10, "Mega Elixir_Mock", 10000, 5000)
//        );
    }
    @Override
    public int insert(Item item) {
        // 挿入したつもりで成功値をそのまま返す
        return 1;
    }

    @Override
    public int update(Item item) {
        // 更新したつもりで成功値をそのまま返す
        return 1;
    }

    @Override
    public int delete(int item) {
        // 削除したつもりで成功値をそのまま返す
        return 1;
    }
}

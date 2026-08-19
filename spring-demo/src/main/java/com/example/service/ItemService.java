/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.service;

import com.example.entity.item.Item;
import java.util.List;

public interface ItemService {

    Item findById(int id);
    List<Item> findAll();
    int insert(Item item);
    int update(Item item);
    int delete(int id);

}

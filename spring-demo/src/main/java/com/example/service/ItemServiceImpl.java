/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.service;

import com.example.entity.item.Item;
import com.example.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import com.example.common.ResourceNotFoundException;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    private final ItemRepository repository;

    public ItemServiceImpl(@Qualifier("itemRepositoryMockImpl") ItemRepository repository) {
        // 本番用 Repositoryの @Repository("itemRepositoryImpl"),
        // Service の @Qualifier("itemRepositoryImpl"),
        // テストコードの @Qualifier("itemRepositoryImpl"),
        // テストコードの @MockitoBean(name = "itemRepositoryImpl") を揃える必要がある
        this.repository = repository;
    }
    @Override
    public Item findById(int id) {
        // TO DO : RepositoryのfindById()を実行
        return null; // TO DO : あとで削除

//        if (item == null) {
//            throw new ResourceNotFoundException("Item not found");
//        }
//        return item;
    }

    @Override
    public List<Item> findAll() {
        // TO DO : RepositoryのfindAll()を実行
        return null; // TO DO : あとで削除
    }

    @Override
    public int insert(Item item) {
        // TO DO : Repositoryのinsert()を実行
        return 0; // TO DO : あとで削除

//        if (result != 1) {
//            throw new ResourceNotFoundException("Insert failed");
//        }
//        return result;
    }

    @Override
    public int update(Item item) {
        // TO DO : Repositoryのupdate()を実行
        return 0; // TO DO : あとで削除

//        if (result != 1) {
//            throw new ResourceNotFoundException("Update failed");
//        }
//        return result;
    }

    @Override
    public int delete(int id) {
        // TO DO : Repositoryのdelete()を実行
        return 0; // TO DO : あとで削除

//        if (result != 1) {
//            throw new ResourceNotFoundException("Delete failed");
//        }
//        return result;
    }
}


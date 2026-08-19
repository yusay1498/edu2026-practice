/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.controller;

import com.example.common.ResourceNotFoundException;
import com.example.entity.item.Item;
import com.example.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ItemRestController {

    private final ItemService service;

    public ItemRestController(ItemService service) {
        this.service = null; // TO DO
    }

    // 1件取得
    @GetMapping("/item/{id}")
    public ResponseEntity<Item> findById(@PathVariable int id) {
        // TO DO

        return null; // TO DO
    }

    // ----------------------------------------------------------------------
    // ResponseEntityについて :
    // ResponseEntity :HTTPレスポンスをJavaで構築するためのラッパークラス
    //   → ステータスコード・ヘッダー・Body を段階的に組み立てる
    // ResponseEntity.ok() → BodyBuilder を返す(ステータスコード：200 OK)
    // ResponseEntity.ok(card) → BodyBuilder を返す(ステータスコード：200 OK、Bodyあり)
    // .status() → Builder を返す　
    //   → status(HttpStatus.CREATED) :201 Created
    //   → status(HttpStatus.NOT_FOUND) :404 Not Found
    // .badRequest() → Builder を返す(ステータスコード：400 Bad Request)
    // .body() → ResponseEntity を返す（完成）
    // .build() → Body なしで ResponseEntity を返す
    // ----------------------------------------------------------------------

    // 一覧取得
    @GetMapping("/item")
    public ResponseEntity<List<Item>> findAll() {
        // TO DO

        return null; // TO DO
    }

    // 1件登録
    @PostMapping("/item")
    public ResponseEntity<Item> insert(@RequestBody Item item) {
        // TO DO

        return null; // TO DO
    }

    // 1件更新
    @PatchMapping("/item/{id}")
    public ResponseEntity<Item> update(@PathVariable int id, @RequestBody Item item) {
        // REST原則では、更新対象はURLでの指定を優先する
        //Item fixed = new Item(id, item.name(), item.price(), item.sellPrice()); // TO DO : あとでコメント外す

        // TO DO

        return null; // TO DO
    }

    // 1件削除
    @DeleteMapping("/item/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        // TO DO

        return null; // TO DO   // 204 No Content
    }
}


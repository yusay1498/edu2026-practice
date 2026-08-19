/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.presentation;

import com.example.dto.CardDetail;
import com.example.domain.entity.Card;
import com.example.application.CardService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class CardRestController {

    private final CardService service;

    public CardRestController(CardService service) {
        this.service = null; // TO DO
    }

    // 1件検索（@RequestParam を使用）、全件検索
    @GetMapping("/card")
    // URL例 : /api/card?id=3 -> 1件検索
    // URL例 : /api/card -> 全件検索
    // CardWebControllerでは1件検索はPOSTリクエストだったが、ここではGETリクエスト
    public ResponseEntity<?> findData(@RequestParam(value = "id", required = false) Integer id) {
        // ResponseEntity<?> : 検索が1件なら戻り値はCard
        // 検索が全件なら戻り値はList<Card>
        // → 条件によって戻り値の型が変わるので、<?>のような表記を行う

        // id が指定されていない場合は全件検索
        // TO DO

        // id が指定されている場合は1件検索
        // TO DO

        return null; // TO DO  // 1件検索成功
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

    // 1件検索（OUTER JOINを使用）
    @GetMapping("/card/detail/{id}")
    public ResponseEntity<CardDetail> findDetail(@PathVariable int id) {
        // TO DO
        return null; // TO DO
    }

    // 登録（POST）
    @PostMapping("/card")
    public ResponseEntity<?> insert(@RequestBody Card card) {
        // TO DO

        return null; // TO DO

    }

    // 更新（PATCH）
    @PatchMapping("/card/{id}")
    public ResponseEntity<?> update(@PathVariable int id, @RequestBody Card card) {
        // REST原則では、更新対象はURLでの指定を優先する
//        Card fixed = new Card(id, card.name(), card.level(), card.elementId(),
//                card.top(), card.right(), card.bottom(), card.left()); // TO DO : あとでコメント外す

        // TO DO

        return null; // TO DO

    }

    // 削除（DELETE）
    @DeleteMapping("/card/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        // TO DO

        return null; // TO DO  // 成功時 204 No Content
    }
}

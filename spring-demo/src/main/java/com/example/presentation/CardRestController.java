/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.presentation;

import com.example.application.CardApplicationService;
import com.example.domain.entity.Card;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/cards")
public class CardRestController {

    private final CardApplicationService service;

    public CardRestController(CardApplicationService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Card>> get() {
        return ResponseEntity.ok(service.list());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Card> get(@PathVariable int id) {
        return ResponseEntity.ok(service.lookup(id));
    }

    @PostMapping
    public ResponseEntity<?> post(@RequestBody Card card) {
        Card newCard = service.insert(card);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newCard.id())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Card> patch(
            @PathVariable int id,
            @RequestBody Card card) {
        if (!Objects.equals(id, card.id())) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(service.update(card));
    }

    @DeleteMapping("id")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}

/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.presentation;

import com.example.application.WeaponApplicationService;
import com.example.domain.entity.Weapon;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/api/weapons")
public class WeaponRestController {

    private final WeaponApplicationService service;

    public WeaponRestController(WeaponApplicationService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Weapon>> get() {
        return ResponseEntity.ok(service.list());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Weapon> get(@PathVariable int id) {
        return ResponseEntity.ok(service.lookup(id));
    }

    @PostMapping
    public ResponseEntity<?> post(@RequestBody Weapon weapon) {
        Weapon newWeapon = service.insert(weapon);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .path("/{id}")
                .buildAndExpand(newWeapon.id())
                .toUri();

        return ResponseEntity.created(location).build();
    }

    @PatchMapping("/{id}")
    public ResponseEntity<Weapon> patch(
            @PathVariable int id,
            @RequestBody Weapon weapon) {
        if (!Objects.equals(id, weapon.id())) {
            return ResponseEntity.badRequest().build();
        }

        return ResponseEntity.ok(service.update(weapon));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable int id) {
        service.delete(id);
        return ResponseEntity.noContent().build();
    }
}

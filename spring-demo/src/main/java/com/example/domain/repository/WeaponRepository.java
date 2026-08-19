/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.domain.repository;

import com.example.domain.entity.Weapon;

import java.util.List;
import java.util.Optional;

public interface WeaponRepository {

    Optional<Weapon> findById(int id);
    List<Weapon> findAll();
    Weapon save(Weapon weapon);
    int delete(int id);

}

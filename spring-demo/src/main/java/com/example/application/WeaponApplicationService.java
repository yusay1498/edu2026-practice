/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.application;

import com.example.domain.ResourceNotFoundException;
import com.example.domain.entity.Weapon;
import com.example.domain.repository.WeaponRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WeaponApplicationService {

    private final WeaponRepository repository;

    public WeaponApplicationService(WeaponRepository repository) {
        this.repository = repository;
    }

    public Weapon lookup(int id) {
        return repository.findById(id).orElseThrow(
                () -> new ResourceNotFoundException("Weapon not found"));
    }

    public List<Weapon> list() {
        return repository.findAll();
    }

    public Weapon insert(Weapon weapon) {
        return repository.save(weapon);
    }

    public Weapon update(Weapon weapon) {
        return repository.save(weapon);
    }

    public void delete(int id) {
        int result = repository.delete(id);

        if (result != 1) {
            throw new ResourceNotFoundException("Delete failed");
        }
    }
}

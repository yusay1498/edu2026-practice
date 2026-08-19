/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.infrastructure;

import com.example.domain.repository.WeaponRepository;
import com.example.domain.entity.Weapon;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("weaponRepositoryMockImpl")
public class MockWeaponRepository implements WeaponRepository {

    private static final List<Weapon> MOCK_WEAPONS = List.of(
            new Weapon(1, "Revolver_Mock", 100, 11, 255),
            new Weapon(2, "Shear Trigger_Mock", 200, 14, 255),
            new Weapon(3, "Cutting Trigger_Mock", 400, 18, 255),
            new Weapon(4, "Flame Saber_Mock", 600, 20, 255),
            new Weapon(5, "Twin Lance_Mock", 800, 22, 255),
            new Weapon(6, "Punishment_Mock", 1000, 24, 255),
            new Weapon(7, "Lion Heart_Mock", 2000, 30, 255),
            new Weapon(8, "Metal Knuckle_Mock", 100, 12, 98),
            new Weapon(9, "Maverick_Mock", 200, 15, 99),
            new Weapon(10, "Gauntlet_Mock", 400, 20, 101)
    );

    @Override
    public Optional<Weapon> findById(int id) {
        return MOCK_WEAPONS.stream()
                .filter(weapon -> weapon.id().equals(id))
                .findFirst();
    }

    @Override
    public List<Weapon> findAll() {
        return MOCK_WEAPONS;
    }

    @Override
    public Weapon save(Weapon weapon) {
        // 保存したつもりでそのまま返す
        return weapon;
    }

    @Override
    public int delete(int id) {
        // 削除したつもりで成功値をそのまま返す
        return 1;
    }

}

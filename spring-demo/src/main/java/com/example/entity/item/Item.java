/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.entity.item;

public record Item(
        // エンティティはnullを受け取る可能性があるため、一律でintではなくIntegerにしている

        Integer id,
        String name
        // TO DO : 以降を追加
) {}

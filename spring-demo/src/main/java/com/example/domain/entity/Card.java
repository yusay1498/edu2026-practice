/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.domain.entity;

public record Card(
    Integer id,
    String name,
    Integer level,
    Integer elementId,
    Integer top,
    Integer right,
    Integer bottom,
    Integer left
) {
}


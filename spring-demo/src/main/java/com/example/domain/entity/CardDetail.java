/**
 * All Rights Reserved, Copyright(c) 2026 Fujitsu Learning Media Limited
 *
 */
package com.example.domain.entity;

public record CardDetail(
        // JOINを扱うためのDTO(Data Transfer Object)
        Integer id,
        String name,
        Integer level,
        Integer elementId,
        String  elementName,
        Integer top,
        Integer right,
        Integer bottom,
        Integer left
) {}

package com.eightbits.commerce.trade.products.dto;

import java.util.UUID;

public record Product(
        UUID productId,
        String name,
        String description
) {
}

package com.eightbits.commerce.trade.products.api;

import com.eightbits.commerce.trade.products.dto.Product;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface ProductService {
    Flux<Product> findAll();

    Mono<Product> findOne(String id);

    Mono<Product> findByProductId(UUID productId);

    void save(Product product);
}

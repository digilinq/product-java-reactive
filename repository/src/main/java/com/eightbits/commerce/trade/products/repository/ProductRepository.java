package com.eightbits.commerce.trade.products.repository;

import com.eightbits.commerce.trade.products.repository.model.ProductDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<ProductDocument, String> {
    Mono<ProductDocument> findByProductId(UUID productId);
}

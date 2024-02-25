package com.eightbits.commerce.trade.products.repository;

import com.eightbits.commerce.trade.products.repository.model.ProductDocument;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ReactiveMongoRepository<ProductDocument, String> {
}

package com.eightbits.commerce.trade.products.repository;

import com.eightbits.commerce.trade.products.repository.configuration.ReactiveMongoConfiguration;
import com.eightbits.commerce.trade.products.repository.model.ProductDocument;
import com.mongodb.reactivestreams.client.MongoClient;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.test.context.ActiveProfiles;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@ActiveProfiles("test")
@DataMongoTest
@Import(ReactiveMongoConfiguration.class)
class ProductRepositoryTest {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    MongoClient mongoClient;

    @Autowired
    ReactiveMongoTemplate mongoTemplate;


    @Test
    void should_work() {
        assertNotNull(productRepository);
        assertNotNull(mongoClient);
        assertNotNull(mongoTemplate);
    }

    @Test
    void save_product() {
        ProductDocument product = new ProductDocument();
        product.setName("Computer");
        product.setDescription("Gaming computer");

        Mono<ProductDocument> savedProduct = productRepository.save(product);
    }

}
package com.eightbits.commerce.trade.products.repository;

import com.eightbits.commerce.trade.products.repository.configuration.MongoReactiveConfiguration;
import com.eightbits.commerce.trade.products.repository.model.ProductDocument;
import com.mongodb.reactivestreams.client.MongoClient;
import com.mongodb.reactivestreams.client.MongoDatabase;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.ReactiveMongoTemplate;
import org.springframework.test.context.ActiveProfiles;
import reactor.core.CoreSubscriber;
import reactor.core.publisher.Mono;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("test")
@DataMongoTest
@Import(MongoReactiveConfiguration.class)
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
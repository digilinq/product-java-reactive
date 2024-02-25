package com.eightbits.commerce.trade.products.repository.configuration;

import org.springframework.data.mongodb.repository.config.EnableReactiveMongoRepositories;

@EnableReactiveMongoRepositories(basePackages = "com.eightbits.commerce.trade.products.repository")
public class MongoReactiveConfiguration {

}

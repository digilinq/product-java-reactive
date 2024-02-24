package com.eightbits.commerce.trade.products.web.resources;

import com.eightbits.commerce.trade.products.generated.v1.api.ProductsApi;
import com.eightbits.commerce.trade.products.generated.v1.model.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
public class ProductsResource implements ProductsApi {
    @Override
    public Mono<ResponseEntity<Product>> findProductById(UUID id, ServerWebExchange exchange) {
        return ProductsApi.super.findProductById(id, exchange);
    }

    @Override
    public Mono<ResponseEntity<Flux<Product>>> findProducts(String productName, ServerWebExchange exchange) {
        return ProductsApi.super.findProducts(productName, exchange);
    }

    @Override
    public Mono<ResponseEntity<Void>> remove(UUID id, ServerWebExchange exchange) {
        return ProductsApi.super.remove(id, exchange);
    }

    @Override
    public Mono<ResponseEntity<Void>> saveProduct(Mono<Product> product, ServerWebExchange exchange) {
        return ProductsApi.super.saveProduct(product, exchange);
    }
}

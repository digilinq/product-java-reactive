package com.eightbits.commerce.trade.products.web.resources;

import com.eightbits.commerce.trade.products.api.ProductService;
import com.eightbits.commerce.trade.products.generated.v1.api.ProductsApi;
import com.eightbits.commerce.trade.products.generated.v1.model.Product;
import com.eightbits.commerce.trade.products.web.mappings.ProductMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("/api/v1")
public class ProductsResource implements ProductsApi {

    private final ProductService service;
    private final ProductMapper mapper;

    public ProductsResource(ProductService service, ProductMapper mapper) {
        this.service = service;
        this.mapper = mapper;
    }

    @Override
    public Mono<ResponseEntity<Product>> findProductById(UUID id, ServerWebExchange exchange) {
        return service.findByProductId(id).map(mapper::map).map(ResponseEntity::ok);
    }

    @Override
    public Mono<ResponseEntity<Flux<Product>>> findProducts(String productName, ServerWebExchange exchange) {
        return Mono.just(ResponseEntity.ok(
                service.findAll().map(mapper::map)
        ));
    }

    @Override
    public Mono<ResponseEntity<Void>> remove(UUID id, ServerWebExchange exchange) {
        return null;
    }

    @Override
    public Mono<ResponseEntity<Void>> saveProduct(Mono<Product> product, ServerWebExchange exchange) {
        return null;
    }
}

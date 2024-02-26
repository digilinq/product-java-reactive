package com.eightbits.commerce.trade.products.service;

import com.eightbits.commerce.trade.products.api.ProductService;
import com.eightbits.commerce.trade.products.dto.Product;
import com.eightbits.commerce.trade.products.repository.ProductRepository;
import com.eightbits.commerce.trade.products.service.mappings.ProductMapper;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository repository;
    private final ProductMapper mapper;

    public ProductServiceImpl(ProductRepository repository, ProductMapper mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Flux<Product> findAll() {
        return repository.findAll().map(mapper::map);
    }

    @Override
    public Mono<Product> findOne(String id) {
        return repository.findById(id).map(mapper::map);
    }

    @Override
    public Mono<Product> findByProductId(UUID productId) {
        return repository.findByProductId(productId).map(mapper::map);
    }

    @Override
    public void save(Product product) {
        repository.save(mapper.map(product)).map(mapper::map);
    }
}

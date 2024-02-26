package com.eightbits.commerce.trade.products.service.mappings;

import com.eightbits.commerce.trade.products.dto.Product;
import com.eightbits.commerce.trade.products.repository.model.ProductDocument;
import org.mapstruct.Mapper;

@Mapper
public interface ProductMapper {
    Product map(ProductDocument product);

    ProductDocument map(Product product);
}

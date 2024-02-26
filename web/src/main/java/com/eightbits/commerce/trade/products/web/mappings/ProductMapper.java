package com.eightbits.commerce.trade.products.web.mappings;

import com.eightbits.commerce.trade.products.generated.v1.model.Product;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Qualifier;

@Mapper
@Qualifier("WebModelMapper")
public interface ProductMapper {
    com.eightbits.commerce.trade.products.dto.Product map(Product product);
    Product map(com.eightbits.commerce.trade.products.dto.Product product);
}

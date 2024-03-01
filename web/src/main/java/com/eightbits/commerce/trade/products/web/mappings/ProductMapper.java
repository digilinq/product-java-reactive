package com.eightbits.commerce.trade.products.web.mappings;

import com.eightbits.commerce.trade.products.generated.v1.model.Product;
import org.mapstruct.AnnotateWith;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@AnnotateWith(value = Component.class, elements = @AnnotateWith.Element(strings = "productWebModelMapper"))
public interface ProductMapper {
    com.eightbits.commerce.trade.products.dto.Product map(Product product);

    Product map(com.eightbits.commerce.trade.products.dto.Product product);
}

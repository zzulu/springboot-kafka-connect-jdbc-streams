package com.coupang.tb2.storeapi.mapper;

import com.coupang.tb2.storeapi.rest.dto.AddProductDto;
import com.coupang.tb2.storeapi.rest.dto.ProductDto;
import com.coupang.tb2.storeapi.rest.dto.UpdateProductDto;
import com.coupang.tb2.storeapi.model.Product;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface ProductMapper {

    Product toProduct(AddProductDto addProductDto);

    ProductDto toProductDto(Product product);

    void updateProductFromDto(UpdateProductDto updateProductDto, @MappingTarget Product product);

}

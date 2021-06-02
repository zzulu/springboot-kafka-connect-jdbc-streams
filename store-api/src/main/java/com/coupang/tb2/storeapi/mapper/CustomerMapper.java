package com.coupang.tb2.storeapi.mapper;

import com.coupang.tb2.storeapi.rest.dto.AddCustomerDto;
import com.coupang.tb2.storeapi.rest.dto.CustomerDto;
import com.coupang.tb2.storeapi.rest.dto.UpdateCustomerDto;
import com.coupang.tb2.storeapi.model.Customer;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE
)
public interface CustomerMapper {

    Customer toCustomer(AddCustomerDto addCustomerDto);

    CustomerDto toCustomerDto(Customer customer);

    void updateCustomerFromDto(UpdateCustomerDto updateCustomerDto, @MappingTarget Customer customer);

}

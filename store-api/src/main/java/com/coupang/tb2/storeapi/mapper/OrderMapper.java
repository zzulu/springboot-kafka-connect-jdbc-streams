package com.coupang.tb2.storeapi.mapper;

import com.coupang.tb2.storeapi.rest.dto.CreateOrderDto;
import com.coupang.tb2.storeapi.rest.dto.OrderDto;
import com.coupang.tb2.storeapi.rest.dto.UpdateOrderDto;
import com.coupang.tb2.storeapi.service.CustomerService;
import com.coupang.tb2.storeapi.model.Order;
import com.coupang.tb2.storeapi.model.OrderProduct;
import com.coupang.tb2.storeapi.service.ProductService;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.springframework.beans.factory.annotation.Autowired;

@Mapper(
        componentModel = "spring",
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE,
        uses = {CustomerService.class, ProductService.class}
)
public abstract class OrderMapper {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private ProductService productService;

    @Mapping(source = "customer.id", target = "customerId")
    @Mapping(source = "orderProducts", target = "products")
    public abstract OrderDto toOrderDto(Order order);

    @Mapping(source = "product.id", target = "id")
    public abstract OrderDto.ProductDto toOrderDtoProductDto(OrderProduct orderProduct);

    public abstract void updateOrderFromDto(UpdateOrderDto updateOrderDto, @MappingTarget Order order);

    public Order toOrder(CreateOrderDto createOrderDto) {
        if (createOrderDto == null) {
            return null;
        }
        Order order = new Order();
        order.setPaymentType(createOrderDto.getPaymentType());
        order.setStatus(createOrderDto.getStatus());
        order.setCustomer(customerService.validateAndGetCustomerById(createOrderDto.getCustomerId()));

        for (CreateOrderDto.CreateOrderProductDto p : createOrderDto.getProducts()) {
            OrderProduct orderProduct = new OrderProduct();
            orderProduct.setOrder(order);
            orderProduct.setProduct(productService.validateAndGetProductById(p.getId()));
            orderProduct.setUnit(p.getUnit());
            order.getOrderProducts().add(orderProduct);
        }
        return order;
    }

}

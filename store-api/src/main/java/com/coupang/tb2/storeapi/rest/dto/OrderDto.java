package com.coupang.tb2.storeapi.rest.dto;

import com.coupang.tb2.storeapi.model.OrderStatus;
import com.coupang.tb2.storeapi.model.PaymentType;
import lombok.Data;

import java.util.List;

@Data
public class OrderDto {

    private String id;
    private Long customerId;
    private PaymentType paymentType;
    private OrderStatus status;
    private List<ProductDto> products;

    @Data
    public static final class ProductDto {
        private Long id;
        private Integer unit;
    }

}

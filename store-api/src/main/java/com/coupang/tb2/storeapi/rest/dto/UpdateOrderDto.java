package com.coupang.tb2.storeapi.rest.dto;

import com.coupang.tb2.storeapi.model.OrderStatus;
import com.coupang.tb2.storeapi.model.PaymentType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class UpdateOrderDto {

    @Schema(example = "CASH")
    private PaymentType paymentType;

    @Schema(example = "PAYED")
    private OrderStatus status;

}

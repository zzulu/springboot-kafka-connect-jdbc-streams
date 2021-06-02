package com.coupang.tb2.storeapi.rest.dto;

import com.coupang.tb2.storeapi.model.OrderStatus;
import com.coupang.tb2.storeapi.model.PaymentType;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.util.List;

@Data
public class CreateOrderDto {

    @Schema(example = "1")
    @NotNull
    private Long customerId;

    @Schema(example = "BITCOIN")
    @NotNull
    private PaymentType paymentType;

    @Schema(example = "OPEN")
    @NotNull
    private OrderStatus status;

    @Valid
    private List<CreateOrderProductDto> products;

    @Data
    public static class CreateOrderProductDto {

        @Schema(example = "15")
        @NotNull
        private Long id;

        @Schema(example = "1")
        @NotNull
        @Positive
        private Integer unit;

    }

}

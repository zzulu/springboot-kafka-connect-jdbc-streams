package com.coupang.tb2.storestreams.serde.json;

import com.coupang.tb2.commons.storeapp.json.OrderProduct;
import org.springframework.kafka.support.serializer.JsonSerde;

public class OrderProductJsonSerde extends JsonSerde<OrderProduct> {
}

package com.coupang.tb2.storestreams.serde.json;

import com.coupang.tb2.commons.storeapp.json.Order;
import org.springframework.kafka.support.serializer.JsonSerde;

public class OrderJsonSerde extends JsonSerde<Order> {
}

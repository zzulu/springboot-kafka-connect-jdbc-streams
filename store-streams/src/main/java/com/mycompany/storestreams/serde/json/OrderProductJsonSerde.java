package com.mycompany.storestreams.serde.json;

import com.mycompany.commons.storeapp.json.OrderProduct;
import org.springframework.kafka.support.serializer.JsonSerde;

public class OrderProductJsonSerde extends JsonSerde<OrderProduct> {
}

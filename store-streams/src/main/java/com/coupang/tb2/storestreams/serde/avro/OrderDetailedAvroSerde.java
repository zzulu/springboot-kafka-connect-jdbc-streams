package com.coupang.tb2.storestreams.serde.avro;

import com.coupang.tb2.commons.storeapp.avro.OrderDetailed;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;

public class OrderDetailedAvroSerde extends SpecificAvroSerde<OrderDetailed> {
}

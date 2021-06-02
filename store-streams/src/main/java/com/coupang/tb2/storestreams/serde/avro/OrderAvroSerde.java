package com.coupang.tb2.storestreams.serde.avro;

import com.coupang.tb2.commons.storeapp.avro.Order;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;

public class OrderAvroSerde extends SpecificAvroSerde<Order> {
}

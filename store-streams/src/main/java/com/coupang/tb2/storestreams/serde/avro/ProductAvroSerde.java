package com.coupang.tb2.storestreams.serde.avro;

import com.coupang.tb2.commons.storeapp.avro.Product;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;

public class ProductAvroSerde extends SpecificAvroSerde<Product> {
}

package com.coupang.tb2.storestreams.serde.avro;

import com.coupang.tb2.commons.storeapp.avro.Customer;
import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;

public class CustomerAvroSerde extends SpecificAvroSerde<Customer> {
}

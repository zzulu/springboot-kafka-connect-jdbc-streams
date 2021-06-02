package com.coupang.tb2.storeapi.repository;

import com.coupang.tb2.storeapi.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}

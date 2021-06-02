package com.coupang.tb2.storeapi.repository;

import com.coupang.tb2.storeapi.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, String> {
}

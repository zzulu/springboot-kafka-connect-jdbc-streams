package com.coupang.tb2.storeapi.repository;

import com.coupang.tb2.storeapi.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}

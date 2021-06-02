package com.coupang.tb2.storeapi.service;

import com.coupang.tb2.storeapi.repository.ProductRepository;
import com.coupang.tb2.storeapi.exception.ProductDeletionException;
import com.coupang.tb2.storeapi.exception.ProductNotFoundException;
import com.coupang.tb2.storeapi.model.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void deleteProduct(Product product) {
        try {
            productRepository.delete(product);
        } catch (DataIntegrityViolationException e) {
            throw new ProductDeletionException(product.getId());
        }
    }

    @Override
    public Product validateAndGetProductById(Long id) {
        return productRepository.findById(id).orElseThrow(() -> new ProductNotFoundException(id));
    }
}

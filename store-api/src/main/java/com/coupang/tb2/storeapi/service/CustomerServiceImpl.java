package com.coupang.tb2.storeapi.service;

import com.coupang.tb2.storeapi.repository.CustomerRepository;
import com.coupang.tb2.storeapi.exception.CustomerDeletionException;
import com.coupang.tb2.storeapi.exception.CustomerNotFoundException;
import com.coupang.tb2.storeapi.model.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public void deleteCustomer(Customer customer) {
        try {
            customerRepository.delete(customer);
        } catch (DataIntegrityViolationException e) {
            throw new CustomerDeletionException(customer.getId());
        }
    }

    @Override
    public Customer validateAndGetCustomerById(Long id) {
        return customerRepository.findById(id).orElseThrow(() -> new CustomerNotFoundException(id));
    }
}

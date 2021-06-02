package com.coupang.tb2.storeapi.service;

import com.coupang.tb2.storeapi.model.Order;

import java.util.List;

public interface OrderService {

    List<Order> getAllOrders();

    Order saveOrder(Order order);

    Order validateAndGetOrderById(String id);

}

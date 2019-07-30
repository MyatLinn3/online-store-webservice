package com.babystore.services;

import com.babystore.model.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    List<Order> findAll();
    Optional<Order> findById(int id);
    Order save(Order order);
    List<Order> blurrySearch(String keywory);
    void removeOne(int id);
}

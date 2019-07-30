package com.babystore.services.servicesImpl;

import com.babystore.model.Order;
import com.babystore.repository.OrderRepository;
import com.babystore.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;
    @Override
    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public Optional<Order> findById(int id) {
        return orderRepository.findById(id);
    }

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    @Override
    public List<Order> blurrySearch(String keywory) {
        return null;
    }

    @Override
    public void removeOne(int id) {
             orderRepository.deleteById(id);
    }
}

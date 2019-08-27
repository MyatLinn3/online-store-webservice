package com.babystore.controller;

import com.babystore.model.Order;
import com.babystore.services.OrderService;
import com.babystore.services.ProductService;
import com.babystore.services.ShippingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/order")
@CrossOrigin("*")
public class OrderController {

  @Autowired
  private OrderService orderService;
  @Autowired
  private ProductService productService;
  @Autowired
  private ShippingAddressService shippingAddressService;

  @PostMapping("/create")
  public void createOrder(@RequestBody Order order) {
    System.out.println(order.getProducts());
    productService.findAll().forEach(a -> {
      order.getProducts().forEach(b -> {
        if (a.getId() == b.getId()) {
          a.setavailableQuantity(a.getavailableQuantity() - 1);
        }
        if (a.getavailableQuantity() == 0) {
          a.setAvailable(false);
        }
      });
    });
    orderService.save(order);
  }

  @GetMapping("/orders")
  public List<Order> getAllOrders() {
    return orderService.findAll();
  }
}

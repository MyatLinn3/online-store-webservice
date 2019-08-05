package com.babystore.controller;

import com.babystore.model.Order;
import com.babystore.model.Product;
import com.babystore.services.OrderService;
import com.babystore.services.ProductService;
import com.babystore.services.ShippingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

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
          a.setQuantity(a.getQuantity() - 1);
        }
        if (a.getQuantity() == 0) {
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

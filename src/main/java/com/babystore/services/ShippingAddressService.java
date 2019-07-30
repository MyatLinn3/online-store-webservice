package com.babystore.services;

import com.babystore.model.ShippingAddress;

import java.util.List;
import java.util.Optional;

public interface ShippingAddressService {
    List<ShippingAddress> findAll();
    Optional<ShippingAddress> findById(int id);
    ShippingAddress save(ShippingAddress shippingAddress);
    List<ShippingAddress> blurrySearch(String keywory);
    void removeOne(int id);
}

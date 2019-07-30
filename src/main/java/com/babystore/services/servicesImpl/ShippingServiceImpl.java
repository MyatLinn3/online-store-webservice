package com.babystore.services.servicesImpl;

import com.babystore.model.ShippingAddress;
import com.babystore.repository.ShippingAddressRepository;
import com.babystore.services.ShippingAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShippingServiceImpl implements ShippingAddressService {

    @Autowired
    private ShippingAddressRepository shippingAddressRepository;
    @Override
    public List<ShippingAddress> findAll() {
        return shippingAddressRepository.findAll();
    }

    @Override
    public Optional<ShippingAddress> findById(int id) {
        return shippingAddressRepository.findById(id);
    }

    @Override
    public ShippingAddress save(ShippingAddress shippingAddress) {
        return shippingAddressRepository.save(shippingAddress);
    }

    @Override
    public List<ShippingAddress> blurrySearch(String keywory) {
        return null;
    }

    @Override
    public void removeOne(int id) {
             shippingAddressRepository.deleteById(id);
    }
}

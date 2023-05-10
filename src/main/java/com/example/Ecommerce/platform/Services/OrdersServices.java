package com.example.Ecommerce.platform.Services;

import com.example.Ecommerce.platform.Models.Orders;
import com.example.Ecommerce.platform.Respositories.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersServices {

    @Autowired
    OrdersRepository ordersRepository;

    public List<Orders> getAllOrders(){
        return ordersRepository.findAll();
    }
}

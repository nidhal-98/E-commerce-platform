package com.example.Ecommerce.platform.Controllers;

import com.example.Ecommerce.platform.Models.Orders;
import com.example.Ecommerce.platform.Services.OrdersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Orders")
public class OrdersControllers {

    @Autowired
    OrdersServices ordersServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Orders> getAllOrders(){
        return ordersServices.getAllOrders();
    }
}

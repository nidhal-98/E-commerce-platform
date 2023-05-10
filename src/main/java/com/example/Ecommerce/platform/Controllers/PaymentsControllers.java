package com.example.Ecommerce.platform.Controllers;

import com.example.Ecommerce.platform.Models.Payments;
import com.example.Ecommerce.platform.Services.PaymentsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Payments")
public class PaymentsControllers {

    @Autowired
    PaymentsServices paymentsServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Payments> getAllPayments(){
        return paymentsServices.getAllPayments();
    }
}

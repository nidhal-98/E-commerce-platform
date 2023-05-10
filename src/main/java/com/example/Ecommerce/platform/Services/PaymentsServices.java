package com.example.Ecommerce.platform.Services;

import com.example.Ecommerce.platform.Models.Payments;
import com.example.Ecommerce.platform.Respositories.PaymentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentsServices {

    @Autowired
    PaymentsRepository paymentsRepository;

    public List<Payments> getAllPayments(){
        return paymentsRepository.findAll();
    }
}

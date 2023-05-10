package com.example.Ecommerce.platform.Services;

import com.example.Ecommerce.platform.Models.ShoppingCarts;
import com.example.Ecommerce.platform.Respositories.ShoppingCartsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingCartsServices {

    @Autowired
    ShoppingCartsRepository shoppingCartsRepository;

    public List<ShoppingCarts> getAllShoppingCarts(){
        return shoppingCartsRepository.findAll();
    }
}

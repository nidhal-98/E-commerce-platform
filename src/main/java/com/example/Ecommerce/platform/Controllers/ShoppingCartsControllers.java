package com.example.Ecommerce.platform.Controllers;

import com.example.Ecommerce.platform.Models.ShoppingCarts;
import com.example.Ecommerce.platform.Services.ShoppingCartsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("ShoppingCarts")
public class ShoppingCartsControllers {
    @Autowired
    ShoppingCartsServices shoppingCartsServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<ShoppingCarts> getAllShoppingCarts(){
        return shoppingCartsServices.getAllShoppingCarts();
    }
}

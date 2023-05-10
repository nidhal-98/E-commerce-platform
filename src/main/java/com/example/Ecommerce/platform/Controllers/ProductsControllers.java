package com.example.Ecommerce.platform.Controllers;

import com.example.Ecommerce.platform.Models.Products;
import com.example.Ecommerce.platform.Services.ProductsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Products")
public class ProductsControllers {

    @Autowired
    ProductsServices productsServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    List<Products> getAllProducts(){
        return productsServices.getAllProducts();
    }

}

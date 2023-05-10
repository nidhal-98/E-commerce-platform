package com.example.Ecommerce.platform.Services;

import com.example.Ecommerce.platform.Models.Products;
import com.example.Ecommerce.platform.Respositories.ProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsServices {

    @Autowired
    ProductsRepository productsRepository;

    public List<Products> getAllProducts(){
        return productsRepository.findAll();
    }
}

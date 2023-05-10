package com.example.Ecommerce.platform.Respositories;

import com.example.Ecommerce.platform.Models.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Integer> {
}

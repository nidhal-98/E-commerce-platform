package com.example.Ecommerce.platform.Respositories;

import com.example.Ecommerce.platform.Models.ShoppingCarts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShoppingCartsRepository extends JpaRepository<ShoppingCarts, Integer> {
}

package com.example.Ecommerce.platform.Respositories;

import com.example.Ecommerce.platform.Models.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
}

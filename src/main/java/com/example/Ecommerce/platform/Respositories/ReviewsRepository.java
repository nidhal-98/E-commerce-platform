package com.example.Ecommerce.platform.Respositories;

import com.example.Ecommerce.platform.Models.Reviews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewsRepository extends JpaRepository<Reviews, Integer> {
}

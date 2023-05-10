package com.example.Ecommerce.platform.Respositories;

import com.example.Ecommerce.platform.Models.Ratings;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingsRepository extends JpaRepository<Ratings, Integer> {
}

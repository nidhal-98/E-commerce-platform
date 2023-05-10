package com.example.Ecommerce.platform.Services;

import com.example.Ecommerce.platform.Models.Reviews;
import com.example.Ecommerce.platform.Respositories.ReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReviewsServices {

    @Autowired
    ReviewsRepository reviewsRepository;

    public List<Reviews> getAllReviews(){
        return reviewsRepository.findAll();
    }
}

package com.example.Ecommerce.platform.Services;

import com.example.Ecommerce.platform.Models.Ratings;
import com.example.Ecommerce.platform.Respositories.RatingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RatingsServices {

    @Autowired
    RatingsRepository ratingsRepository;

    public List<Ratings> getAllRatings(){
        return ratingsRepository.findAll();
    }
}

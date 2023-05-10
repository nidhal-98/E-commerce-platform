package com.example.Ecommerce.platform.Controllers;

import com.example.Ecommerce.platform.Models.Reviews;
import com.example.Ecommerce.platform.Services.ReviewsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Reviews")
public class ReviewsControllers {

    @Autowired
    ReviewsServices reviewsServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Reviews> getAllReviews(){
        return reviewsServices.getAllReviews();
    }
}

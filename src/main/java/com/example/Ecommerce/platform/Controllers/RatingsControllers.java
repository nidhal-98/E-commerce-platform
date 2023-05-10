package com.example.Ecommerce.platform.Controllers;

import com.example.Ecommerce.platform.Models.Ratings;
import com.example.Ecommerce.platform.Services.RatingsServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Ratings")
public class RatingsControllers {

    @Autowired
    RatingsServices ratingsServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Ratings> getAllRatings(){
        return ratingsServices.getAllRatings();
    }


}

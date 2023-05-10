package com.example.Ecommerce.platform.Controllers;

import com.example.Ecommerce.platform.Models.Users;
import com.example.Ecommerce.platform.Services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("Users")
public class UsersControllers {

    @Autowired
    UsersServices usersServices;

    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Users> getAllUsers() {
        return usersServices.getAllUsers();
    }

}

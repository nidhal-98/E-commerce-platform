package com.example.Ecommerce.platform.Services;

import com.example.Ecommerce.platform.Models.Users;
import com.example.Ecommerce.platform.Respositories.UsersRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsersServices {

    @Autowired
    UsersRespository usersRespository;

    public List<Users> getAllUsers(){
        return usersRespository.findAll();
    }
}

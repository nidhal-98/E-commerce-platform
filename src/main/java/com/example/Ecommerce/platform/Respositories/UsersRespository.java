package com.example.Ecommerce.platform.Respositories;

import com.example.Ecommerce.platform.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRespository extends JpaRepository<Users, Integer> {
}

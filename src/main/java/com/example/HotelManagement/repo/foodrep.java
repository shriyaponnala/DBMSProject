package com.example.HotelManagement.repo;

import com.example.HotelManagement.domain.foodinfo;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface foodrepo extends JpaRepository<foodinfo,Integer> {
}
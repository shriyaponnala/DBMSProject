package com.example.HotelManagement.repo;

import com.example.HotelManagement.domain.roominfo;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface roomrepo extends JpaRepository<roominfo,Integer> {

}
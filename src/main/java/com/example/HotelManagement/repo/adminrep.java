package com.example.HotelManagement.repo;

import com.example.HotelManagement.domain.admininfo;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface adminrep extends JpaRepository<admininfo,Integer> {

    @Query(value= "SELECT * FROM Admin WHERE phoneNo = Pno", nativeQuery=true)
    public Admin adminbypno(int pno);
}
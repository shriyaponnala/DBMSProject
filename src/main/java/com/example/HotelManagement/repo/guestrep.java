package com.example.HotelManagement.repo;

import com.example.HotelManagement.domain.guestinfo;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface guestrepo extends JpaRepository<guestinfo,Integer> {

    @Query(value= "UPDATE Guest SET room_booked = roomNo WHERE phoneNo = Pno", nativeQuery=true)
    public roomupdate(int pno, int roomNo);

    @Query(value= "SELECT * FROM Guest WHERE phoneNo = Pno", nativeQuery=true)
    public Guest guestbypno(int pno);

}
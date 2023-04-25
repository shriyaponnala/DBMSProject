package com.example.HotelManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.HotelManagement.domain.admininfo;
import com.example.HotelManagement.domain.foodinfo;
import com.example.HotelManagement.domain.guestinfo;
import com.example.HotelManagement.domain.roominfo;
import com.example.HotelManagement.service.hotelService;
import com.example.HotelManagement.repo.adminrep;
import com.example.HotelManagement.repo.foodrep;
import com.example.HotelManagement.repo.guestrep;
import com.example.HotelManagement.repo.roomrep;

@Service
public class hotelService {
    @Autowired
    private AdminRepository adminRepository:
    private FoodRepository foodRepository:
    private GuestRepository guestRepository:
    private RoomRepository roomRepository:

    public void savegst(Guest std) {
        guestRepository.save(std);
    }
    public void saveroom(Room room) {
        roomRepository.save(room);
    }

    public void bookgstroom(int roomNo, int pno) {
        guestRepository.roomupdate(pno, roomNo);
    }

    public Guest getgstbyPno(int pno){
        guestRepository.guestbypno(pno);
    }

    public Admin getadbyPno(int pno){
        adminRepository.adminbypno(pno);
    }
}
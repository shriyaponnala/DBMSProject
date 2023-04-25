package com.example.HotelManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.example.HotelManagement.domain.admininfo;
import com.example.HotelManagement.domain.foodinfo;
import com.example.HotelManagement.domain.guestinfo;
import com.example.HotelManagement.domain.roominfo;
import com.example.HotelManagement.service.hotelService;

@Controller
public class hotelController {

    @Autowired

    private hotelService service;


    @GetMapping("/signup")
    public String viewHomePage(Model model) {
        model.addAttribute("guest", new guestinfo());
        return "signup";
    }

    @RequestMapping(value = "/signup", method = RequestMethod.POST)
    public String saveGuest(@ModelAttribute("guest") guestinfo gst) {
        service.savegst(gst);
        return "signup";
    }

    @GetMapping("/guest/{PhoneNo}")
    public String viewGuestPage(@PathVariable(name = "PhoneNo") int phoneNo) {
        Guest guestdetails = service.getgstbyPno(phoneNo);
        model.addAttribute("guestdetails", guestdetails)
        return "guest";
    }

    @GetMapping("/food")
    public String view(Model model) {
        model.addAttribute("food", new foodinfo());
        return "food";
    }

    @GetMapping("/admin/{PhoneNo}")
    public String viewAdminPage(@PathVariable(name = "PhoneNo") int phoneNo) {
        Admin admindetails = service.getadbyPno(phoneNo);
        model.addAttribute("admindetails", admindetails)
        return "admin";
    }

    @GetMapping("/room")
    public String add(Model model) {
        model.addAttribute("room", new roominfo());
        return "room";
    }

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveGuest(@ModelAttribute("room") roominfo room) {
        service.saveroom(room);
        int pno = room.guest;
        service.bookgstroom(room.No, pno);
        return "room";
    }

}
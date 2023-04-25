package com.example.HotelManagement.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "GUEST")
public class guestinfo {

    @Id
    @GeneratedValue
    private int id;
    private String name;
    private String email;
    private long phoneNo;
    @Column(name="roomBooked")
    private int roomBooked = 0;
}
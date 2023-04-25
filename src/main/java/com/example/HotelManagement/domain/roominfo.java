package com.example.HotelManagement.domain

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
@Table(name = "ROOM")
public class roominfo {

    @Id
    @GeneratedValue
    private int id;
    private int no;
    private int price;
    private int guest;
}
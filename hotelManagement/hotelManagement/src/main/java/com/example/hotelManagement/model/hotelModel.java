package com.example.hotelManagement.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "hotel_data")
public class hotelModel 
{

    @Id
    private int hotelId;
    @Column
    private String hotelName;
    private String hotelLocation;
    private int hotelPhNo;

    public hotelModel() {
    }

    public hotelModel(int hotelId, String hotelName, String hotelLocation, int hotelPhNo) {
        this.hotelId = hotelId;
        this.hotelName = hotelName;
        this.hotelLocation = hotelLocation;
        this.hotelPhNo = hotelPhNo;
    }


    public int getHotelId() {
        return hotelId;
    }
    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }
    public String getHotelName() {
        return hotelName;
    }
    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }
    public String getHotelLocation() {
        return hotelLocation;
    }
    public void setHotelLocation(String hotelLocation) {
        this.hotelLocation = hotelLocation;
    }
    public int getHotelPhNo() {
        return hotelPhNo;
    }
    public void setHotelPhNo(int hotelPhNo) {
        this.hotelPhNo = hotelPhNo;
    }



}

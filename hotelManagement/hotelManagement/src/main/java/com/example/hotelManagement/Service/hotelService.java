package com.example.hotelManagement.Service;


import java.util.List;


import com.example.hotelManagement.model.hotelModel;

public interface hotelService 
{
    
    public String createHotel(hotelModel hotelmodel);
    public String updateHotel(hotelModel hotelmodel);
    public String deleteHotel(int hotelId);
    public hotelModel getHotel(int hotelId);

    public List<hotelModel> getAllHotels();
}

package com.example.hotelManagement.Service.serviceImplementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hotelManagement.Repository.hotelRepository;
import com.example.hotelManagement.Service.hotelService;
import com.example.hotelManagement.model.hotelModel;

@Service
public class hotelServiceImpl implements hotelService{


    hotelRepository hotelrepo;
    public hotelServiceImpl(hotelRepository hotelrepo) {
        this.hotelrepo = hotelrepo;
    }

    @Override
    public String createHotel(hotelModel hotelmodel) {
        hotelrepo.save(hotelmodel);
        return "Created";
    }

    @Override
    public String updateHotel(hotelModel hotelmodel) {
        hotelrepo.save(hotelmodel);
        return "updated";
    }


    @Override
    public String deleteHotel(int hotelId) {
        hotelrepo.deleteById(hotelId);
        return "Deleted";
    }

    @Override
    public hotelModel getHotel(int hotelId) 
    {
        return hotelrepo.findById(hotelId).get();
    }


    @Override
    public List<hotelModel> getAllHotels() {
        return hotelrepo.findAll();
    }

    
    
}

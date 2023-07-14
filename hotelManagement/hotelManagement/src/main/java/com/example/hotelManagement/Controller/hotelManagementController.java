package com.example.hotelManagement.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotelManagement.Service.hotelService;
import com.example.hotelManagement.model.hotelModel;

@RestController
@RequestMapping("/hotels")
public class hotelManagementController 
{
    
    hotelModel hotelmodel;
    hotelService hotelservice;
    public hotelManagementController(hotelService hotelservice) {
        this.hotelservice = hotelservice;
    }

    @PostMapping("/create")
    public String createHotel(@RequestBody hotelModel hotelmodel)
    {
        hotelservice.createHotel(hotelmodel);
        return "Hotel details created successfully";
    }

    @GetMapping("/getdetails/{hotelId}")
    public hotelModel getHotelDetails(@PathVariable("hotelId") int hotelId)
    {
        return hotelservice.getHotel(hotelId);
    }

    @PutMapping("/update")
    public String updateHotel(@RequestBody hotelModel hotelmodel)
    {
        hotelservice.updateHotel(hotelmodel);
        return "Hotel details updated successfully";
    }

    @DeleteMapping("delete/{hotelId}")
    public String deleteHotel(@PathVariable("hotelId") int hotelId)
    {
        hotelservice.deleteHotel(hotelId);
        return "Hotel details deleted successfully";
    }

    @GetMapping("/allhotels")
    public List<hotelModel> getAllHotelDetails()
    {
        return hotelservice.getAllHotels();
    }
}

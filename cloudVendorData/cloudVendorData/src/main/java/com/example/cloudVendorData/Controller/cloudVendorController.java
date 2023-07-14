package com.example.cloudVendorData.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.cloudVendorData.Service.cloudVendorService;
import com.example.cloudVendorData.model.vendorDetails;

@RestController
@RequestMapping("/vendordetails")
public class cloudVendorController 
{
    vendorDetails vendordetails; //creating an object for the business layer class


    //implementing service later class as controller classwill be interacting with the business layer/service layer 
    cloudVendorService vendorservice;//create a constructor for the service layer implementation
    public cloudVendorController(cloudVendorService vendorservice) {
        this.vendorservice = vendorservice;
    }

    @PostMapping("/create")
    public String createVendorDetails(@RequestBody vendorDetails vendordetails)
    {
        vendorservice.createVendorDetails(vendordetails);
        return "vendor details created successfully";
    }

    //To read a specific clod vendor and below is the another api to return all the vendors in the database
    @GetMapping("{vendorId}")
    public vendorDetails getVendorDetails(@PathVariable("vendorId") int vendorId)//takes vendorID from the path variable and return the object vendordetails to the VendorDetails class object
    {
        return vendorservice.getVendorDetails(vendorId);//returns vendordetails from the repo interacting through service layer
    }

    @GetMapping("/getdetails")
    public List<vendorDetails> getVendorDetails()
    {
        return vendorservice.getAllVendors();
    }

    @PutMapping("/update")
    public String updateVendorDetails(@RequestBody vendorDetails vendordetails)
    {
        vendorservice.updateVendorDetails(vendordetails);
        return "vendor details updated successfully";
    }

    @DeleteMapping("/delete/{vendorId}")
    public String deleteVendorDetails(@PathVariable("vendorId") int vendorId)
    {
        vendorservice.deleteVendorDetails(vendorId);
        return "vendor details deleted successfully";
    }
}

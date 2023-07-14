package com.example.cloudVendorData.Service.implementation;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.cloudVendorData.Repository.cloudVendorRepository;
import com.example.cloudVendorData.Service.cloudVendorService;
import com.example.cloudVendorData.model.vendorDetails;

@Service
public class cloudVendorServiceImpl implements cloudVendorService
{

    cloudVendorRepository cloudvendorrepo; //create a constructor for this class
    public cloudVendorServiceImpl(cloudVendorRepository cloudvendorrepo) {
        this.cloudvendorrepo = cloudvendorrepo;
    }


    @Override
    public String createVendorDetails(vendorDetails vendordetails) {
        // If needed more business logic
        cloudvendorrepo.save(vendordetails); //save() method is used to save the data coming from repo constructor to vendordetails class and finally to the table created from the business layer.
        return "Success";
    }

    @Override
    public String updateVendorDetails(vendorDetails vendordetails) {
        // If needed more business logic
        cloudvendorrepo.save(vendordetails);
        return "Updated";
    }

    @Override
    public String deleteVendorDetails(int vendorId) {
        // If needed more business logic
        cloudvendorrepo.deleteById(vendorId);
        return "Deleted";
    }

    @Override
    public vendorDetails getVendorDetails(int vendorId) {
        // If needed more business logic
        return cloudvendorrepo.findById(vendorId).get();
    }

    @Override
    public List<vendorDetails> getAllVendors() 
    {
        // If needed more business logic
        return cloudvendorrepo.findAll();
    }
    
}

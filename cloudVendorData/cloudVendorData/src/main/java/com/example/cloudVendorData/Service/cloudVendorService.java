package com.example.cloudVendorData.Service;


import java.util.List;

import com.example.cloudVendorData.model.vendorDetails;

public interface cloudVendorService 
{
    public String createVendorDetails(vendorDetails vendordetails);
    public String updateVendorDetails(vendorDetails vendordetails);
    public String deleteVendorDetails(int vendorId);
    public vendorDetails getVendorDetails(int vendorId);

    //create a list of cloud vendors as there might be many
    public List<vendorDetails> getAllVendors(); 
}

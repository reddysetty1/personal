package com.example.cloudVendorData.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "vendor_info")
public class vendorDetails 
{

     //with this annotation the below variable properties are automatically created with vendor_id, vendor_name etc..
    @Id 
    private int vendorId;
    @Column
    private String vendorName;
    private String vendorAddress;
    private int vendorPhNo;
    //No parameter constructor
    public vendorDetails() {
    }

    //parameterised constructor
    public vendorDetails(int vendorId, String vendorName, String vendorAddress, int vendorPhNo) {
        this.vendorId = vendorId;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhNo = vendorPhNo;
    }

    //getters and setters
    public int getVendorId() {
        return vendorId;
    }
    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }
    public String getVendorName() {
        return vendorName;
    }
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }
    public String getVendorAddress() {
        return vendorAddress;
    }
    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }
    public int getVendorPhNo() {
        return vendorPhNo;
    }
    public void setVendorPhNo(int vendorPhNo) {
        this.vendorPhNo = vendorPhNo;
    }
}

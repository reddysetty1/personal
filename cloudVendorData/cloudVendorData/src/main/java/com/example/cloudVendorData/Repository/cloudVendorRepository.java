package com.example.cloudVendorData.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.cloudVendorData.model.vendorDetails;

public interface cloudVendorRepository extends JpaRepository<vendorDetails, Integer> //this jpa repository has lot of inbuild methods which are not needed to be implemented physically
//Adding the business layer class and the primary key data type in this JPA repository
{
    
}

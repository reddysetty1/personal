package com.example.hotelManagement.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hotelManagement.model.hotelModel;

public interface hotelRepository extends JpaRepository<hotelModel,Integer>
{
    
}

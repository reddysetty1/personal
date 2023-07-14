package com.example.BankOne.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BankOne.Entity.Users;

public interface userRepo extends JpaRepository<Users, Integer> 
{
    
}

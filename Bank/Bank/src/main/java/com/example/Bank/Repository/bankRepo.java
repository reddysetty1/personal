package com.example.Bank.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Bank.Model.users;

public interface bankRepo extends JpaRepository<users, Integer>
{
    @Query(nativeQuery = true, value = "SELECT * FROM users where name = ?1" )
    public users findByname(String name);
}

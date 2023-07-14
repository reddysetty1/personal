package com.example.BankOne.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.BankOne.Entity.Accounts;

public interface accountRepo extends JpaRepository<Accounts, Integer>
{

}
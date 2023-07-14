package com.example.BankOne.Service;

import java.util.List;

import com.example.BankOne.Entity.Users;
import com.example.BankOne.RequestBody.userAccount;

public interface bankService 
{
    public String createUser(userAccount useraccount);

    public String createAccount(userAccount useraccount);

    public List<Users> getUsers();
}

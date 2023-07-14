package com.example.Bank.Service;

import com.example.Bank.Model.users;

public interface bankService 
{
    public String createAccount(users user);

    public users getUsers(int accountNo);

    public users getAllUsersByName(String name);

}

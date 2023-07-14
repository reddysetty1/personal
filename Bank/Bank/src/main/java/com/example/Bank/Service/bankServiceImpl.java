package com.example.Bank.Service;

import org.springframework.stereotype.Service;

import com.example.Bank.Model.users;
import com.example.Bank.Repository.bankRepo;

@Service
public class bankServiceImpl implements bankService
{

    bankRepo bankrepo;
    public bankServiceImpl(bankRepo bankrepo) {
        this.bankrepo = bankrepo;
    }

    @Override
    public String createAccount(users user) 
    {
        // users sample = user;
        // sample.setName(sample.getName()==null ? "error" : sample.getName());
        // sample.setSavingsAccount((!sample.isSavingsAccount() && sample.getAssets()>0) ? true : sample.isSavingsAccount());
        bankrepo.save(user);

        return "Success";
    }
    
    public users getUsers(int accountNo)
    {
        return bankrepo.findById(accountNo).get();
    }

    @Override
    public users getAllUsersByName(String name) {
        return bankrepo.findByname(name);
    }

    
}

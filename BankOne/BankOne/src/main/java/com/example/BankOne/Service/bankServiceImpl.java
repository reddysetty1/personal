package com.example.BankOne.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.BankOne.Entity.Accounts;
import com.example.BankOne.Entity.Users;
import com.example.BankOne.Repository.accountRepo;
import com.example.BankOne.Repository.userRepo;
import com.example.BankOne.RequestBody.userAccount;

@Service
public class bankServiceImpl implements bankService
{

    userRepo userrepo;
    accountRepo accrepo;
    public bankServiceImpl(userRepo userrepo, accountRepo accrepo) {
        this.userrepo = userrepo;
        this.accrepo = accrepo;
    }

    @Override
    public String createUser(userAccount useraccount) {
        Users users = new Users();
        users.setUserId(useraccount.getUserId());
        users.setUserName(useraccount.getUserName());
        users.setUserAge(useraccount.getUserAge());
        users.setUserPhno(useraccount.getUserPhno());
        
        Accounts accounts = new Accounts();
        accounts.setAccountType(useraccount.getAccountType());
        accounts.setWorth(useraccount.getWorth());
        accounts.setUsers(users);
        
        userrepo.save(users);
        accrepo.save(accounts);

        return "Success";
    }

    @Override
    public String createAccount(userAccount useraccount) {
        Users users = new Users();
        users.setUserId(useraccount.getUserId());
        Accounts accounts = new Accounts();
        accounts.setAccountType(useraccount.getAccountType());
        accounts.setWorth(useraccount.getWorth());
        accounts.setUsers(users);

        accrepo.save(accounts);

        return "Success";
    }

    @Override
    public List<Users> getUsers() {
       List<Users> users = userrepo.findAll();
        return users;
    }

    

    
}

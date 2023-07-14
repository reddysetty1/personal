package com.example.BankOne.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankOne.Entity.Users;
import com.example.BankOne.RequestBody.userAccount;
import com.example.BankOne.Service.bankService;

@RestController
@RequestMapping("/bank")
public class bankController 
{
    Users users;
    bankService bankservice;
    public bankController(bankService bankservice) 
    {
        this.bankservice = bankservice;
    }

    

    @PostMapping("/create")
    public String createUser(@RequestBody userAccount useraccount)
    {
        bankservice.createUser(useraccount);
        return "user created";
    }

    @PostMapping("/createaccount")
    public String createAccount(@RequestBody userAccount useraccount)
    {
        List<Users> users = bankservice.getUsers();
        List<Users> a = users.stream().filter(user-> (useraccount.getUserId()!=0 && (user.getUserId()==useraccount.getUserId())) || (useraccount.getUserPhno()!=0 && (user.getUserPhno()==useraccount.getUserPhno()))).toList();
        if(a.size()!=0)
        {
            useraccount.setUserId(a.get(0).getUserId());
            useraccount.setUserPhno(a.get(0).getUserPhno());
            bankservice.createAccount(useraccount);
        }
        else
            bankservice.createUser(useraccount);
        
        return "Account created";
    }
}

package com.example.Bank.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Bank.Model.users;
import com.example.Bank.Service.bankService;

@RestController
@RequestMapping("/banking")
public class bankController 
{
    bankService bankservice;
    public bankController(bankService bankservice) {
        this.bankservice = bankservice;
    }

    @PostMapping("/createuser")
    public String createAccount(@RequestBody users user)
    {
        bankservice.createAccount(user);
        return "Account created Successfully";
    }

    @GetMapping("/get/{accountNo}")
    public users getUsers(@PathVariable int accountNo)
    {
        return bankservice.getUsers(accountNo);
    }


    @GetMapping("/getAll/{name}")
    public users getAllUsersByName(@PathVariable String name)
    {
        return bankservice.getAllUsersByName(name);
    }
}

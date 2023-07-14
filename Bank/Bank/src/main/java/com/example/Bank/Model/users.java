package com.example.Bank.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "users")
public class users 
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int accountNo;
    @Column
    private String name;
    
    @Embedded
    private accounts account;

    private double netWorth;

    
    public int getAccountNo() {
        return accountNo;
    }
    

    public users(int accountNo, String name, accounts account, double netWorth) {
        this.accountNo = accountNo;
        this.name = name;
        this.account = account;
        this.netWorth = netWorth;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public accounts getAccount() {
        return account;
    }

    public void setAccount(accounts account) {
        this.account = account;
    }

    public double getNetWorth() {
        return netWorth;
    }

    public void setNetWorth(double netWorth) {
        this.netWorth = netWorth;
    }

    public users() {
    }




}

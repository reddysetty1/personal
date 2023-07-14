package com.example.BankOne.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "accounts")
public class Accounts 
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int accountId;
    private String accountType;
    private double worth;
    
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    public Accounts() {
    }

    public Accounts(int accountId, String accountType, double worth, Users users) {
        this.accountId = accountId;
        this.accountType = accountType;
        this.worth = worth;
        this.users = users;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }


    public double getWorth() {
        return worth;
    }

    public void setWorth(double worth) {
        this.worth = worth;
    }


    public Users getUsers() {
        return users;
    }

    public void setUsers(Users users) {
        this.users = users;
    }


    
}

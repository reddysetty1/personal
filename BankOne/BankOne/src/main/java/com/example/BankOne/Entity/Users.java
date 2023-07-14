package com.example.BankOne.Entity;


import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name = "users")
public class Users 
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int userId;
    private String userName;

    @Column(unique = true)
    private int userPhno;

    private int userAge;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "users")
    private List<Accounts> accounts;

    @Transient
    private List<Integer> userIds = new ArrayList<>();
    @Transient
    private List<Integer> userPhns = new ArrayList<>();


    public Users() {
    }


    public Users(int userId, String userName,int userPhno, int userAge, List<Accounts> accounts) {
        this.userId = userId;
        this.userName = userName;
        this.userPhno = userPhno;
        this.userAge = userAge;
        this.accounts = accounts;
    }

    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getUserPhno() {
        return userPhno;
    }
    public void setUserPhno(int userPhno) {
        this.userPhno = userPhno;
    }
    public int getUserAge() {
        return userAge;
    }
    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public List<Accounts> getAccounts() {
        return accounts;
    }
    public void setAccounts(List<Accounts> accounts) {
        this.accounts = accounts;
    }
    public List<Integer> getUserIds() {
        return userIds;
    }
    public void setUserIds(List<Integer> userIds) 
    {
        userIds.add(userId);
        this.userIds = userIds;
    }
    public List<Integer> getUserPhns() {
        return userPhns;
    }
    public void setUserPhns(List<Integer> userPhns) {
        userPhns.add(userPhno);
        this.userPhns = userPhns;
    }
    
}

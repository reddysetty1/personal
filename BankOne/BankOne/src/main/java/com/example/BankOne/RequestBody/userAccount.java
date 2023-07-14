package com.example.BankOne.RequestBody;

public class userAccount 
{
    private int userId;
    private String userName;
    private int userPhno;
    private int userAge;
    private double worth;
    private String accountType;
    

    public userAccount() {
    }
    

    public userAccount(int userId, String userName, int userPhno, int userAge, double worth, String accountType) {
        this.userId = userId;
        this.userName = userName;
        this.userPhno = userPhno;
        this.userAge = userAge;
        this.worth = worth;
        this.accountType = accountType;
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

    public int getUserId() {
        return userId;
    }


    public void setUserId(int userId) {
        this.userId = userId;
    }
}

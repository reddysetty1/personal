package com.example.addition.domain;

public class addNumbers 
{
    private int num1;
    private int num2;
    
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    public int sum()
    {
        System.out.println(num1);
        System.out.println(num2);
        return num1+num2;
        
    }
}

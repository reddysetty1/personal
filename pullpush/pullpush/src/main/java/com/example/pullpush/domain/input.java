package com.example.pullpush.domain;

public class input 
{
    private String name;
    private String age;
    
    public input() 
    {
    }
    
    public input(String name, String age) 
    {
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(String age) {
        this.age = age;
    }
    
}

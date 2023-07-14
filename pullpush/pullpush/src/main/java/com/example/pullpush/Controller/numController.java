package com.example.pullpush.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.pullpush.domain.input;

@RestController
@RequestMapping("/api")
public class numController 
{
    @GetMapping("/getSum/{num1}/{num2}")
    public int sumNumbers(@PathVariable("num1") int num1,@PathVariable("num2") int num2){
        return num1 + num2;
    }

    @GetMapping("/getsub/{num1}/{num2}")
    public int subNumbers(@PathVariable("num1") int a, @PathVariable("num2") int b)
    {
        return a-b;
    }
    @GetMapping("/getname/{name}")
    public String getname(@PathVariable("name") String name)
    {
        return name;
    }
    @GetMapping("/getnames/{name1}/{name2}")
    public String getNames(@PathVariable("name1") String n1,@PathVariable("name2") String n2)
    {
        return n1+" "+n2;
    }


    @GetMapping("/getdetails")
    public String getDetails(@RequestParam String name, String address, int age)
    {
        return name+" "+address+" "+age;
    }


    @PostMapping("/putmydetails")
    public String putMyDetails(@RequestBody input input)
    {
        
        return "Record added Successfully";
    }

    @GetMapping("/getmydetails")
    public String getMyDetails(@RequestBody input input)
    {
        return input.getName()+" "+input.getAge();
    }
    
}


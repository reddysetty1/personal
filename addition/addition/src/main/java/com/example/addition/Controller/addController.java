package com.example.addition.Controller;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.addition.domain.addNumbers;




@RestController
@RequestMapping
public class addController 
{
    @GetMapping("/index")
    public String putNumbers(Model model)
    {
        model.addAttribute("addnumbers", new addNumbers());
        return "index";
    }
    
    @PostMapping("/output")
    public String showResult(@ModelAttribute addNumbers addnumbers, BindingResult sum, Model model)
    {
        model.addAttribute("addnumbers", new addNumbers());
        return "addition";
    }
    
}

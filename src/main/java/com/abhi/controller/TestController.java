package com.abhi.controller;


import com.abhi.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class TestController {

    @GetMapping("/register")
    public String showEmployerForm(@ModelAttribute("employee") Employee employee) {
        return "home";
    }

    @PostMapping("/register")
    public String getEmployeeDetails(Map<String, Object> model, @ModelAttribute("employee") Employee employee) {
        System.out.println("getEmployeeDetails()...");
        model.put("employee", employee);
        return "employee_details";
    }
}

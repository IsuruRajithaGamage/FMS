package com.example.FMS.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {

    @GetMapping("/Employees")
    public String getEmployee() {
        return "Employee";
    }
}

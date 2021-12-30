package com.example.FMS.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleTypeController {

    @GetMapping("/VehicleTypes")
    public String getVehicleType(){
        return "VehicleType";
    }
}

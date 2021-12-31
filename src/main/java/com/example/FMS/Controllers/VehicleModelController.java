package com.example.FMS.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class VehicleModelController {

    @GetMapping("vehicleModels")
    public String getVehicleModel(){
        return "VehicleModel";
    }
}

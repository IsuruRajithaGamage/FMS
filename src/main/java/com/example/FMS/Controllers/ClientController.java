package com.example.FMS.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClientController {

    @GetMapping("/Clients")
    public String getClient(){
        return "Client";
    }

}

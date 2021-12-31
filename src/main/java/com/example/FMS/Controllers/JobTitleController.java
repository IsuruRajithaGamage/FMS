package com.example.FMS.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JobTitleController {

    @GetMapping("/jobTitle")
    public String getJobTitle(){
        return "JobTitle";
    }
}

package com.example.FMS.Controllers;

import com.example.FMS.models.Country;
import com.example.FMS.repositories.CountryRepository;
import com.example.FMS.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class CountryController {

    @Autowired
    private CountryService countryService;



    @GetMapping("/Countries")
    public String getCountries(Model model){
        List<Country> countryList = countryService.getCountries();
    model.addAttribute("countries", countryList);
        return "country";
    }

    //save new
    @PostMapping("/Countries/addNew")
    public String addNew(Country country){
        countryService.saveCountry(country);
        return "redirect:/Countries";
    }


}

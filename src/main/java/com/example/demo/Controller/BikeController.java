package com.example.demo.Controller;

import com.example.demo.Bike;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BikeController {
    @Autowired
    Bike bike;
    @GetMapping("/bike")
    public String GetBike(){
        return bike.GetString();
    }
}

package com.mncz.rps.setting_scores.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HealthCheck {

    @GetMapping("/health-check")
    public String health(){
        return "Ok";
    }

}

package com.unclebae.parkinglogshare.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sosi")
public class TestController {

    @RequestMapping("{sosiId}")
    public String getSosi(@PathVariable Long sosiId) {
        return String.valueOf(sosiId);
    }
}
package com.github.sthefanyk.bank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BankPageController {
    @GetMapping("/bank")
    public String home() {
        return "bank";
    }

    @GetMapping("/bank/adminstration")
    public String adminstration() {
        return "adminstration";
    }
    
}

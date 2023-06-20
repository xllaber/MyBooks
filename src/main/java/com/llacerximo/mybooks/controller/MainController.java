package com.llacerximo.mybooks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Calendar;
import java.util.GregorianCalendar;

@Controller
public class MainController {
    @GetMapping("/")
    public String index(Model model) {
        Calendar calendar = new GregorianCalendar();
        model.addAttribute("year", calendar.get(Calendar.YEAR));
        return "index";
    }

}

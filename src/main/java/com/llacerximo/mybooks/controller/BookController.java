package com.llacerximo.mybooks.controller;

import com.llacerximo.mybooks.bussines.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookService bookService;

    @GetMapping("/{year}")
    public String getAll(@RequestParam(defaultValue = "2023") int year, Model model) {
        model.addAttribute("books", bookService.getAll(year));
        return "books";
    }
}

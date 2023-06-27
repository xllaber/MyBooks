package com.llacerximo.mybooks.controller;

import com.llacerximo.mybooks.bussines.service.BookService;
import com.llacerximo.mybooks.bussines.service.impl.BookServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/books")
public class BookController {

    private BookService bookService = new BookServiceImpl();

    @GetMapping("/")
    public String getAll(@RequestParam int year, Model model) {
        model.addAttribute("books", bookService.getAll(year));
        return "books";
    }
}

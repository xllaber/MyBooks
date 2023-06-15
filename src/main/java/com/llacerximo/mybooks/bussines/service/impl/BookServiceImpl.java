package com.llacerximo.mybooks.bussines.service.impl;

import com.llacerximo.mybooks.bussines.entity.Book;
import com.llacerximo.mybooks.bussines.service.BookService;
import com.llacerximo.mybooks.persistance.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<Book> getAll(int year) {
        return bookRepository.getAll(year);
    }
}

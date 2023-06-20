package com.llacerximo.mybooks.bussines.service.impl;

import com.llacerximo.mybooks.bussines.entity.Book;
import com.llacerximo.mybooks.bussines.service.BookService;
import com.llacerximo.mybooks.persistance.BookRepository;
import com.llacerximo.mybooks.persistance.impl.JdbcBookRepositoryImpl;

import java.util.List;

public class BookServiceImpl implements BookService {

    private BookRepository bookRepository = new JdbcBookRepositoryImpl();

    @Override
    public List<Book> getAll(int year) {
        return bookRepository.getAll(year);
    }
}

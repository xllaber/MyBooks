package com.llacerximo.mybooks.bussines.service;

import com.llacerximo.mybooks.bussines.entity.Book;

import java.util.List;


public interface BookService {
    List<Book> getAll(int year);
}

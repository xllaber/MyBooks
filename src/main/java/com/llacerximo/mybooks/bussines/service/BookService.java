package com.llacerximo.mybooks.bussines.service;

import com.llacerximo.mybooks.bussines.entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {
    List<Book> getAll(int year);
}

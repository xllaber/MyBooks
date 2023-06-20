package com.llacerximo.mybooks.persistance;

import com.llacerximo.mybooks.bussines.entity.Book;

import java.util.List;

public interface BookRepository {
    List<Book> getAll(int year);
}

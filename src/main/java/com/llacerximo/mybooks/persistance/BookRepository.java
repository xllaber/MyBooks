package com.llacerximo.mybooks.persistance;

import com.llacerximo.mybooks.bussines.entity.Book;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository {
    List<Book> getAll(int year);
}

package com.llacerximo.mybooks.persistance.impl;

import com.llacerximo.mybooks.bussines.entity.Book;
import com.llacerximo.mybooks.db.DBUtil;
import com.llacerximo.mybooks.persistance.BookRepository;
import com.llacerximo.mybooks.persistance.TableNames;
import com.llacerximo.mybooks.persistance.mapper.BookRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class JdbcBookRepositoryImpl implements BookRepository {

    private TableNames tableName = TableNames.BOOK;
    private JdbcTemplate jdbcTemplate;

    public JdbcBookRepositoryImpl() {
        this.jdbcTemplate = new JdbcTemplate(DBUtil.getDatasource());
    }

    @Override
    public List<Book> getAll(int year) {
        try(Connection connection = DBUtil.getConnection()) {
            String sql = "select * from " + tableName.name() + " where year(finishDate) = ?";
            List<Book> books = jdbcTemplate.query(sql, new BookRowMapper(), year);
            return books;
        } catch (SQLException e){
            throw new RuntimeException(e.getMessage());
        }
    }
}

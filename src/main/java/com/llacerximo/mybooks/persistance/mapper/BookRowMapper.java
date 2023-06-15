package com.llacerximo.mybooks.persistance.mapper;

import com.llacerximo.mybooks.bussines.entity.Book;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class BookRowMapper implements RowMapper<Book>{

    @Override
    public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
        String id = rs.getString("id");
        String title = rs.getString("title");
        String opinion = rs.getString("opinion");
        int pages = rs.getInt("pages");
        boolean fave = rs.getBoolean("fave");
        int sagaNum = rs.getInt("sagaNum");
        Date publishDate = rs.getDate("publishDate");
        Date startDate = rs.getDate("startDate");
        Date finishDate = rs.getDate("finishDate");
        String img = rs.getString("img");
        return new Book(id, title, opinion, img, startDate, finishDate, publishDate, pages, sagaNum, fave);
    }
}

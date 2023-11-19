package com.vm.library.dao;

import com.vm.library.models.Book;
import jdk.jshell.StatementSnippet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

@Component
public class BookDAO {
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public BookDAO(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public List<Book> index() {
        return jdbcTemplate.query("SELECT * FROM library", new BeanPropertyRowMapper<>(Book.class));
    }

    public Book showBook(int id) {
        return jdbcTemplate.query("SELECT * FROM Library WHERE id=?", new Object[]{id},
                new BeanPropertyRowMapper<>(Book.class)).stream().findAny().orElse(null);
    }

    public void save(Book book) {
//        jdbcTemplate.update("INSERT INTO library VALUES (1, ?, ?, ?)",
//                book.getName(), book.getPublisher(), book.getGenre());
        jdbcTemplate.update("INSERT INTO library (name, publisher, genre) VALUES (?, ?, ?)", book.getName(),
                book.getPublisher(), book.getGenre());

    }

    public void update(int id, Book updatedBook) {
        jdbcTemplate.update("UPDATE library SET name=?, publisher=?, genre=? WHERE id=?",
                updatedBook.getName(), updatedBook.getPublisher(), updatedBook.getGenre(), id);
    }

    public void delete(int id) {
        jdbcTemplate.update("DELETE  FROM library WHERE id=?", id);
    }
}

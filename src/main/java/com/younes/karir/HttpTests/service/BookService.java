package com.younes.karir.HttpTests.service;

import com.younes.karir.HttpTests.model.Book;

import java.util.List;

public interface BookService {
    public Book get(Integer id);
    public List<Book> getAll();
    public Book create(Integer authorId,Book book);

}

package com.younes.karir.HttpTests.service;

import com.younes.karir.HttpTests.model.Author;

import java.util.List;

public interface AuthorService {

    public Author get(Integer id);
    public List<Author> getAll();
    public Author create(Author author);

}

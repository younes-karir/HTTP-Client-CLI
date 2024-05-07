package com.younes.karir.HttpTests.service.impl;

import com.younes.karir.HttpTests.model.Book;
import com.younes.karir.HttpTests.repository.AuthorRepository;
import com.younes.karir.HttpTests.repository.BookRepository;
import com.younes.karir.HttpTests.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;



    @Override
    public Book get(Integer id) {
        return bookRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Book> getAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book create(Integer authorId, Book book) {
        var author = authorRepository.findById(authorId).orElseThrow();

        var data = Book.builder()
                .author(author)
                .title(book.getTitle())
                .build();

        return bookRepository.save(data);
    }
}

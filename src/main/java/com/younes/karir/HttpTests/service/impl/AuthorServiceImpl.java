package com.younes.karir.HttpTests.service.impl;


import com.younes.karir.HttpTests.model.Author;
import com.younes.karir.HttpTests.repository.AuthorRepository;
import com.younes.karir.HttpTests.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRepository authorRepository;



    @Override
    public Author get(Integer id) {
        return authorRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Author> getAll() {
        return authorRepository.findAll();
    }

    @Override
    public Author create(Author author) {
        var data = Author.builder()
                .firstName(author.getFirstName())
                .lastName(author.getLastName())
                .build();
        return authorRepository.save(data);
    }
}

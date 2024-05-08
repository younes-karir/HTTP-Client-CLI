package com.younes.karir.HttpTests.controller;


import com.younes.karir.HttpTests.model.Author;
import com.younes.karir.HttpTests.service.AuthorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("author")
public class AuthorController {


    private final AuthorService authorService;


    @PostMapping
    public Author create(@RequestBody Author author){
        return authorService.create(author);
    }

    @GetMapping("{id}")
    public Author get(@PathVariable Integer id){
        return authorService.get(id);
    }

    @GetMapping
    public List<Author> getAll(){
        return authorService.getAll();
    }


}

package com.younes.karir.HttpTests.controller;


import com.younes.karir.HttpTests.model.Book;
import com.younes.karir.HttpTests.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("books")
public class BookController {

    private final BookService bookService;

    @PostMapping("/author/{id}")
    public Book create(@RequestBody Book book,@PathVariable Integer id){
        System.out.println(id);
        return bookService.create(id,book);
    }


    @GetMapping("{id}")
    public Book get(@PathVariable Integer id){
        return bookService.get(id);
    }


    @GetMapping
    public List<Book> getAll(){
        return bookService.getAll();
    }

}

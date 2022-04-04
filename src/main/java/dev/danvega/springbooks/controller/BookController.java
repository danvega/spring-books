package dev.danvega.springbooks.controller;

import dev.danvega.springbooks.model.Book;
import dev.danvega.springbooks.repository.BookRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @SchemaMapping(typeName = "Query",value = "allBooks")
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @QueryMapping
    public Book findOne(@Argument Integer id) {
        return bookRepository.findOne(id);
    }
}

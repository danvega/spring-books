package dev.danvega.springbooks.repository;

import dev.danvega.springbooks.model.Author;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AuthorRepository {

    private List<Author> authors = new ArrayList<>();

    public List<Author> findAll() {
        return authors;
    }

    public Author findById(int id) {
        return authors.stream()
                .filter(author -> author.id() == id)
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Author not found"));
    }

    public Author findByName(String name) {
        return authors.stream()
                .filter(author -> author.fullName().equals(name))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Author not found"));
    }

    @PostConstruct
    private void init() {
        authors.add(new Author(1,"Josh","Long"));
        authors.add(new Author(2,"Mark","Heckler"));
        authors.add(new Author(3,"Greg","Turnquist"));
    }
}

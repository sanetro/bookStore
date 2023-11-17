package org.example.book.store.dao.impl.memory;

import org.example.book.store.dao.IBookDAO;
import org.example.book.store.model.Book;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookRepository implements IBookDAO {
    private final List<Book> books = new ArrayList<>();

    @Override
    public Optional<Book> getById(int id) {
        return Optional.empty();
    }

    @Override
    public List<Book> getAll() {
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public void update(Book book) {

    }

    @Override
    public List<Book> getByPattern(String pattern) {
        return null;
    }
}

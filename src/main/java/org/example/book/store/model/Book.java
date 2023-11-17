package org.example.book.store.model;

import lombok.Data;

@Data
public class Book {
    private int id;
    private String title;
    private String author;
    private String isbn;
    private int price;
    private int quantity;

}

package com.vm.library.models;

import jakarta.validation.constraints.NotEmpty;

public class Book {
    int id;
    @NotEmpty(message = " field name should not be empty")
    String name;
    @NotEmpty(message = "field publisher should not be empty")
    String publisher;
    @NotEmpty(message = "field genre should not be empty")
    String genre;

    public Book() {
    }

    public Book(int id, String name, String publisher, String genre) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.genre = genre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

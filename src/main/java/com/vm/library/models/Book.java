package com.vm.library.models;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class Book {
    int id;
    @NotEmpty(message = " field name should not be empty")
    String name;
    @NotEmpty(message = "field publisher should not be empty")
    String publisher;
    @NotEmpty(message = "field genre should not be empty")
    String genre;
}

package com.loits.libraryApp.dto;

import com.loits.libraryApp.enums.BookType;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Size;

public class Book {
    @NotEmpty(message = "Please enter a valid value")
    @Size(max = 20, message = "Please enter a value less than 20 characters")
    private String title;

    @NotEmpty(message = "Description is mandatory")
    private String description;

    private BookType type;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BookType getType() {
        return type;
    }

    public void setType(BookType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", type=" + type +
                '}';
    }
}

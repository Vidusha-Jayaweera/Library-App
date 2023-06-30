package com.loits.libraryApp.repository;

import com.loits.libraryApp.dto.Book;
import com.loits.libraryApp.entity.BookEntity;

public interface BookRepository {

    void save(BookEntity bookEntity);
}

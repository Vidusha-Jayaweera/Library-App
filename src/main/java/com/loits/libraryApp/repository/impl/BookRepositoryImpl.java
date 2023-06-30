package com.loits.libraryApp.repository.impl;

import com.loits.libraryApp.dto.Book;
import com.loits.libraryApp.entity.BookEntity;
import com.loits.libraryApp.repository.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImpl implements BookRepository {

    private static final Logger log = LoggerFactory.getLogger(BookRepositoryImpl.class);

    @Override
    public void save(BookEntity bookEntity) {
        log.info("Saving book in repository layer : {}", bookEntity);
        String sql = "INSERT INTO movie VALUES (?, ?, ?)";
        //needs to save in actual DB
    }
}

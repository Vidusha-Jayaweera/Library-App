package com.loits.libraryApp.service.impl;

import com.loits.libraryApp.dto.Book;
import com.loits.libraryApp.entity.BookEntity;
import com.loits.libraryApp.mapper.BookMapper;
import com.loits.libraryApp.repository.BookRepository;
import com.loits.libraryApp.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    private static final Logger log = LoggerFactory.getLogger(BookServiceImpl.class);
    private final BookRepository bookRepository;
    private final BookMapper bookMapper;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository, BookMapper bookMapper) {
        this.bookRepository = bookRepository;
        this.bookMapper = bookMapper;
    }

    @Override
    public String saveBook(Book book) {
        log.info("Saving book in service layer: {}", book);

        //copy movie properties to entity
        BookEntity bookEntity = bookMapper.mapDtoToEntity(book);

        log.info("-----Book Entity : {}", bookEntity);

        bookRepository.save(bookEntity);

        return "Success";
    }
}

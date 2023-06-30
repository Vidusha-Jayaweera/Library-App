package com.loits.libraryApp.mapper;

import com.loits.libraryApp.dto.Book;
import com.loits.libraryApp.entity.BookEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;
@Component
public class BookMapper {

    private final ModelMapper modelMapper;

    @Autowired
    public BookMapper(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public BookEntity mapDtoToEntity(Book book){

        BookEntity bookEntity = modelMapper.map(book, BookEntity.class);
        bookEntity.setId(UUID.randomUUID().toString());

        /*
         We can do what we have done below using ModelMapper(As implemented above)

        BookEntity bookEntity = new BookEntity();

        bookEntity.setId(UUID.randomUUID().toString());
        bookEntity.setTitle(book.getTitle());
        bookEntity.setDescription(book.getDescription());
        bookEntity.setType(book.getType());
        */

        return bookEntity;
    }
}

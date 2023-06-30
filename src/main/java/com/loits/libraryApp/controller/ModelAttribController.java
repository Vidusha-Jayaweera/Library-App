package com.loits.libraryApp.controller;

import com.loits.libraryApp.enums.BookType;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.Arrays;
import java.util.List;

@ControllerAdvice
public class ModelAttribController {
    @ModelAttribute("types")
    public List<BookType> getBookTypes(){
        List<BookType> types = Arrays.asList(BookType.values());
        return types;
    }
}

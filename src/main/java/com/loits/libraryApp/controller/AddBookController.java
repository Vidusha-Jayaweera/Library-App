package com.loits.libraryApp.controller;

import com.loits.libraryApp.dto.Book;
import com.loits.libraryApp.service.BookService;
import com.loits.libraryApp.service.impl.BookServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
@RequestMapping("/add-book")
public class AddBookController {

    private static final Logger log = LoggerFactory.getLogger(AddBookController.class);

    //2.field injection
//    @Autowired
//    private BookService bookService;

    private final BookService bookService;

    //1.constructor injection
    @Autowired
    public AddBookController(BookService bookService) {
        this.bookService = bookService;
    }

    //3.setter injection
//    @Autowired
//    public void setBookService(BookService bookService) {
//        this.bookService = bookService;
//    }

    @GetMapping
    public String init(Model model){
        model.addAttribute("book", new Book());
        return "addBook";
    }

    //2nd way of doing above GetMapping
//    @GetMapping
//    public ModelAndView init(){
//        ModelAndView modelAndView = new ModelAndView("addBook", "book", new Book());
//        return modelAndView;
//    }

    //3rd way of doing above GetMapping
//    @ModelAttribute("book")
//    public Book initBook(){
//        return new Book();
//    }
//    @GetMapping
//    public String init(){
//        return "addBook";
//    }

    //@PostMapping("/save")
    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public String saveBook(@Valid @ModelAttribute("book") Book book, BindingResult bindingResult){
        log.info("saving book: {}", book);
        log.info("validation result: {}", bindingResult.hasErrors());

        if (bindingResult.hasErrors()){
            return "addBook"; //here we returns the view(view means the jsp file)
        }

        String result = bookService.saveBook(book);
        log.info("Result from service: {}", result);

        return "redirect:/home";
    }
}

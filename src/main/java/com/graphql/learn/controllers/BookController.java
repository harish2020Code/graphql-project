package com.graphql.learn.controllers;

import com.graphql.learn.entities.Book;
import com.graphql.learn.services.BookService;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

//@RestController
//@RequestMapping("/books")
@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    //create
    //@PostMapping - No Need
    @MutationMapping("createBook")
    public Book create(@Argument BookInput book){
        Book b = new Book();
        b.setTitle(book.getTitle());
        b.setDesc(book.getDesc());
        b.setPrice(book.getPrice());
        b.setAuthor(book.getAuthor());
        b.setPages((book.getPages()));
        return  this.bookService.create(b);
    }

    // get all
    //@GetMapping  - No Need
    //@SchemaMapping - Can work
    @QueryMapping("allBooks")
    public List<Book> getAll(){
        return  this.bookService.getAll();
    }

    //get single book
    //@GetMapping("/{bookId}") - No need
    @QueryMapping("getBook")
    public Book getBook(@Argument int bookId){  // Change Argument from PathVariable from
        return  this.bookService.getBook(bookId);
    }

}
@Getter
@Setter
class BookInput{

    private String title;
    private String desc;
    private String author;
    private double price;
    private int pages;

}
package com.libraryapi.web.controller;
import com.libraryapi.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.sql.Timestamp;

@RestController
public class BookController {

    @GetMapping(value = "/Books")
    public String listingBooks(){
        return "All this books ....";
    }

    @GetMapping(value="/Books/{id}")
    public Book ListingOneBook(@PathVariable int id){
        Book test = new Book(id, "Test", "", "image", new Timestamp( 2019));
        return test;
    }
}

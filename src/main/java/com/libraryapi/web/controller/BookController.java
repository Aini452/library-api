package com.libraryapi.web.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @GetMapping(value = "/Books")
    public String listingBooks(){
        return "All this books ....";
    }

    @GetMapping(value="/Books/{id}")
    public String ListingOneBook(@PathVariable int id){
        return "Vous avez demandé le livre " + id;
    }
}

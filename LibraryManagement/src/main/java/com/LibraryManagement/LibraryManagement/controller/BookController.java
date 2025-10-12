package com.LibraryManagement.LibraryManagement.controller;

import com.LibraryManagement.LibraryManagement.model.Book;
import com.LibraryManagement.LibraryManagement.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @PostMapping
    public Book addBook(@RequestBody Book book){
        return bookRepository.save(book);
    }

    @DeleteMapping("/{id}")
    public void removeBook(@PathVariable int id){
        bookRepository.deleteById(id);
    }

    @GetMapping
    public List<Book> getAllBooks(){
        return bookRepository.findAll();
    }
    @PutMapping("/{id}")
    public Book updateBook(@PathVariable int id, @RequestBody Book updatedBook) {
        return bookRepository.findById(id)
                .map(existingBook -> {
                    existingBook.setTitle(updatedBook.getTitle());
                    existingBook.setAuthor(updatedBook.getAuthor());
                    existingBook.setCopiesavailable(updatedBook.getCopiesavailable());
                    return bookRepository.save(existingBook);
                })
                .orElseGet(() -> {
                    // If book with this ID doesn't exist, create a new one with this ID
                    updatedBook.setBookid(id);
                    return bookRepository.save(updatedBook);
                });
    }
}
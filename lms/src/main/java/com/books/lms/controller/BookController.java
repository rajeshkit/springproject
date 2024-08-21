package com.books.lms.controller;

import org.springframework.web.bind.annotation.RestController;

import com.books.lms.entity.Book;
import com.books.lms.service.BookService;
import com.books.lms.service.BookServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
public class BookController {
   @Autowired   
    BookService bookService;

    @PostMapping("/books")
    public ResponseEntity<Book> addBook(@RequestBody Book book) {
        System.out.println("Book controller");
        System.out.println(book);
        
        return ResponseEntity.ok(bookService.addBook(book));
    }
    @GetMapping("/books")
     public List<Book> getAllBooks() {
       return  bookService.getAllBooks();  
    }

    @GetMapping("/books/{id}")
    public Book getBookById(@PathVariable("id") int bookId) {
        
      return bookService.getBookById(bookId);
    }

    // @Override
    // public Book updateBook(Book book) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'updateBook'");
    // }

    // @Override
    // public String deleteBookById(int bookId) {
    //     // TODO Auto-generated method stub
    //     throw new UnsupportedOperationException("Unimplemented method 'deleteBookById'");
    // }
    
}

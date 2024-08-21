package com.lms.bookservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lms.bookservice.entity.Book;
import com.lms.bookservice.repository.BookRepository;


@Service
public class BookServiceImpl implements BookService{
    @Autowired
    BookRepository bookRepository;

    @Override
    public Book addBook(Book book) {
      return bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
      return bookRepository.findAll();
       
    }

    @Override
    public Book getBookById(int bookId) {
       Optional<Book> book=bookRepository.findById(bookId);
       if(book.isEmpty()){
        return null;
       }
       return book.get();
    }

    @Override
    public Book updateBook(Book book) {
       Book b =  getBookById(book.getBookId());
       
      return bookRepository.save(book);
    }

    @Override
    public String deleteBookById(int bookId) {
        //bookRepository.deleteById(bookId);
        return null;
    }

}

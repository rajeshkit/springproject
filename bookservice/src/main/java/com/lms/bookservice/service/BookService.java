package com.lms.bookservice.service;

import java.util.List;

import com.lms.bookservice.entity.Book;



public interface BookService {
    public Book addBook(Book book);
    public List<Book> getAllBooks();
	public Book getBookById(int bookId);
    public Book updateBook(Book book);
	public String deleteBookById(int bookId);

}

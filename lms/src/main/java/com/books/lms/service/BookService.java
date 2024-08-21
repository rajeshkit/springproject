package com.books.lms.service;

import java.util.List;

import com.books.lms.entity.Book;

public interface BookService {
    public Book addBook(Book book);
    public List<Book> getAllBooks();
	public Book getBookById(int bookId);
    public Book updateBook(Book book);
	public String deleteBookById(int bookId);

}

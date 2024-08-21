package com.books.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.books.lms.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{

}

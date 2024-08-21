package com.lms.bookservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lms.bookservice.entity.Book;

public interface BookRepository extends JpaRepository<Book,Integer>{

}

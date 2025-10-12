package com.LibraryManagement.LibraryManagement.repository;

import com.LibraryManagement.LibraryManagement.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Integer> {



}

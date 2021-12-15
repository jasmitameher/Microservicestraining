package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Book;

public interface BookRepo extends JpaRepository<Book, String> {

		Book findByBookId(String id);

}

package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Book;
import com.example.demo.entity.Employee;
import com.example.demo.service.BookServices;

@RestController
public class BookController {
	
	@Autowired
    private BookServices service;
	
	@GetMapping("/book")
	public List<Book> list() {
	    return service.listAll();
	}
	
	@GetMapping("/book/{id}")
	public ResponseEntity<Book> get(@PathVariable String id) {
	    try {
	    	Book book = service.get(id);
	        return new ResponseEntity<Book>(book, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Book>(HttpStatus.NOT_FOUND);
	    }	    
	    
	}
	
	@GetMapping("/save")
	public String save() {
	    return service.save(null);
	}
	
		
}


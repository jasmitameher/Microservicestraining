package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepo;


@Service
@Transactional
public class BookServices {
	
	@Autowired
    private BookRepo repo;
     
    public List<Book> listAll() {
        return repo.findAll();
    }    
    
     
    public Book get(String id) {
        return repo.findByBookId(id);
    }
    
    public String save(String id) {
    	Book book= new Book();
    	book.setBookId("1111");
    	book.setName("mybook");
    	book.setAuthor("newauthor");
    	book.setCopiesAvailable(1);
    	book.setTotalCopies(2);
        repo.save(book);
        return "book object is saved";
    }
    
    
     
}


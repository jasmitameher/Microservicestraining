package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Subscrption;
import com.example.demo.service.SubscrptionServices;

@RestController
public class SubscrptionController {
	
	@Autowired
    private SubscrptionServices service;
	
	@GetMapping("/subscrption")
	public List<Subscrption> list() {
	    return service.listAll();
	}
	
	@GetMapping("/subscrption/{id}")
	public ResponseEntity<Subscrption> get(@PathVariable String id) {
	    try {
	    	Subscrption subscrption = service.get(id);
	        return new ResponseEntity<Subscrption>(subscrption, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Subscrption>(HttpStatus.NOT_FOUND);
	    }	    
	    
	}
	
	/*
	 * @GetMapping("/save") public String save() { return service.save(null); }
	 */
		
}


package com.example.demo.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeServices;

@RestController
public class EmployeeController {
	
	@Autowired
    private EmployeeServices service;
	
	@GetMapping("/emploees")
	public List<Employee> list() {
	    return service.listAll();
	}
	
	@GetMapping("/employess/{id}")
	public ResponseEntity<Employee> get(@PathVariable Integer id) {
	    try {
	    	Employee employee = service.get(id);
	        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
	    } catch (NoSuchElementException e) {
	        return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
	    }      
	}
	
	@PostMapping("/employees")
	public void add(@RequestBody Employee employee) {
	    service.save(employee);
	}
	
}


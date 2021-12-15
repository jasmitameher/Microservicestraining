package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.repository.EmployeeRepo;


@Service
@Transactional
public class EmployeeServices {
	
	@Autowired
    private EmployeeRepo repo;
     
    public List<Employee> listAll() {
        return repo.findAll();
    }
     
    public void save(Employee product) {
        repo.save(product);
    }
     
    public Employee get(Integer id) {
        return repo.findById(id).get();
    }
     
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}


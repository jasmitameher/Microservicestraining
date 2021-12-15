package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Book;
import com.example.demo.entity.Subscrption;

public interface SubscrptionRepo extends JpaRepository<Subscrption, String> {

	Subscrption findByBookId(String id);

}

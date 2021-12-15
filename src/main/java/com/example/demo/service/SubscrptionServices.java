package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Subscrption;
import com.example.demo.repository.SubscrptionRepo;

@Service
@Transactional
public class SubscrptionServices {

	@Autowired
	private SubscrptionRepo repo;

	public List<Subscrption> listAll() {
		return repo.findAll();
	}

	public Subscrption get(String id) {
		return repo.findByBookId(id);
	}

	/*
	 * public String save(String id) { Subscrption subscrption= new Subscrption();
	 * subscrption.setBookId("1122"); subscrption.setSubscriberName("nam");
	 * subscrption.setDateSubscribed("2020-10-10").
	 * subscrption.setDateReturned("2020-12-12"); repo.save(subscrption); return
	 * "book object is saved"; }
	 */

}

package com.example.demo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="subscription")
public class Subscrption {
	
	@Id
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "SUBSCRIBER_NAME")
	private String subscriberName;
	
	@Column(name = "BOOK_ID")
	private String bookId;
	
	@Column(name = "DATE_SUBSCRIBED")
    private Date dateSubscribed;
	
	@Column(name = "DATE_RETURNED")
    private Date dateReturned;
    
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getSubscriberName() {
		return subscriberName;
	}
	public void setSubscriberName(String subscriberName) {
		this.subscriberName = subscriberName;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public Date getDateSubscribed() {
		return dateSubscribed;
	}
	public void setDateSubscribed(Date dateSubscribed) {
		this.dateSubscribed = dateSubscribed;
	}
	public Date getDateReturned() {
		return dateReturned;
	}
	public void setDateReturned(Date dateReturned) {
		this.dateReturned = dateReturned;
	}
	@Override
	public String toString() {
		return "Subscrption [id=" + id + ", subscriberName=" + subscriberName + ", bookId=" + bookId
				+ ", dateSubscribed=" + dateSubscribed + ", dateReturned=" + dateReturned + "]";
	}

	
}


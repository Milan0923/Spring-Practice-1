package com.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="springhib_books", 
	   uniqueConstraints={@UniqueConstraint(columnNames={"code"})})

public class Book {
	@Id	
	@Column(name="code")
	private int bookId;
	
	@Column(name="title", length=20)
	private String title;
	
	@Column(name="author", length=20)
	private String author;
	
	@Column(name="publ", length=20)
	private String publication;
	
	@Column(name="price")
	private double price;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Book(int bookId, String title, String author, String publication,
			double price) {
		super();
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.publication = publication;
		this.price = price;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}

	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", title=" + title + ", author="
				+ author + ", publication=" + publication + ", price=" + price
				+ "]";
	}
	
	

}

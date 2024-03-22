package edu.kh.jsp.model.dto;

public class Book {
	private String title;
	private String writer;
	private int price;
	
	//기본
	public Book() {}

	//매개변수
	public Book(String title, String writer, int price) {
		super();
		this.title = title;
		this.writer = writer;
		this.price = price;
	}

	//getter/setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//tostring
	@Override
	public String toString() {
		return "Book [title=" + title + ", writer=" + writer + ", price=" + price + "]";
	}
	
	

}

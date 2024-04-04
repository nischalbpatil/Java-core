package com.learning.core.day1session1;

public class D01P01 {
	static class Book{
		private String bookTitle;
		private double bookPrice;
		
		public String getBookTitle() {
			return bookTitle;	
		}
		
		public void setBookTitle(String bookTitle) {
			this.bookTitle = bookTitle;
		}
		public double getBookPrice() {
			return bookPrice;
		}
		
		public void setBookPrice(double bookPrice) {
			this.bookPrice = bookPrice;
		}
	}
	
	public static Book createBook(String title,double price) {
		Book book = new Book();
		book.setBookTitle(title);
		book.setBookPrice(price);
		return book;
	}
	
	public static void showBook(Book book) {
		System.out.println("Book Title: "+ book.getBookTitle() + " and Price: " + String.format("%.2f", book.getBookPrice()));
	}
	
	public static void main(String[] args) {
		String title ="Java Programming";
		double price = 350.00;
		
		Book book = createBook(title, price);
		
		showBook(book);
	}

}

package com.psl.q1;



public class Book {

		int book_id;
		String book_name;
		String book_author;
		double  book_price;
		BookCategory book_category;
		
		public int getBook_id() {
			return book_id;
		}
		public void setBook_id(int book_id) {
			this.book_id = book_id;
		}
		public String getBook_name() {
			return book_name;
		}
		public void setBook_name(String book_name) {
			this.book_name = book_name;
		}
		public String getBook_author() {
			return book_author;
		}
		public void setBook_author(String book_author) {
			this.book_author = book_author;
		}
		public double getBook_price() {
			return book_price;
		}
		public void setBook_price(double book_price) {
			this.book_price = book_price;
		}
		public BookCategory getBook_category() {
			return book_category;
		}
		public void setBook_category(BookCategory book_category) {
			this.book_category = book_category;
		}	
		

}

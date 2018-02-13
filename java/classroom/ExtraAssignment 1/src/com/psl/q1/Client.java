package com.psl.q1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.StringTokenizer;

public class Client {

	List<Book> bList = new ArrayList<Book>();

	public void collectBookDetails(String filename) {
		// TODO Auto-generated method stub

		BufferedReader br = null;
		FileInputStream fis = null;
		StringTokenizer st = null;
		Book b=null;

		File f = new File(filename);
		try {

			fis = new FileInputStream(f);
			br = new BufferedReader(new InputStreamReader(fis));
			String str = null;

			while ((str = br.readLine()) != null) {
				b = new Book();
				st = new StringTokenizer(str, ",");
				b.setBook_id(Integer.parseInt(st.nextToken()));
				b.setBook_name(st.nextToken());
				b.setBook_author(st.nextToken());
				b.setBook_price(Double.parseDouble(st.nextToken()));
				b.setBook_category(BookCategory.valueOf(st.nextToken().toUpperCase()));
				bList.add(b);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {

				br.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

	public void printAllBookDetails() {
		// TODO Auto-generated method stub
		System.out.println("All book details are :");
		Iterator<Book> itr = bList.iterator();
		while (itr.hasNext()) {
			Book book = itr.next();
			System.out.println(book.getBook_id() + "  " + book.getBook_name()
					+ "  " + book.getBook_author() + "  "
					+ book.getBook_price() + "  " + book.getBook_category());

		}

	}

	public void searchSpecificTypeBook(String type) {
		// TODO Auto-generated method stub
		System.out.println("\n THe book of type "+type+" :");
		Iterator<Book> itr = bList.iterator();
		while (itr.hasNext()) {
			Book b = itr.next();
			if (b.getBook_category() == BookCategory.valueOf(type.toUpperCase())) {
				System.out.println(b.getBook_id() + "  " + b.getBook_name()
						+ "  " + b.getBook_author() + "  " + b.getBook_price());
			}
		}

	}

	public static void main(String[] args) {

		Client c = new Client();
		c.collectBookDetails("bookdetails.csv");
		c.printAllBookDetails();
		c.searchSpecificTypeBook("math");
	}

}
